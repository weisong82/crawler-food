import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import dao.Recipe;
import dao.Step;

import net.vidageek.crawler.ContentVisitor;
import net.vidageek.crawler.Page;
import net.vidageek.crawler.PageVisitor;
import net.vidageek.crawler.Status;
import net.vidageek.crawler.Url;


/**
 * http://www.meishij.net/zuofa/suanxiangjinshaxia.html
 * 
 * @author wei
 *
 */
public class MeishijieVisitor implements PageVisitor {
	static Logger log = Logger.getLogger(MeishijieVisitor.class);

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.ContentVisitor#onError(net.vidageek.crawler.Url, net.vidageek.crawler.Status)
	 */
	public void onError(Url paramUrl, Status paramStatus) {
		log.info("===================onError:"+paramUrl + paramStatus.toString());

	}

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.ContentVisitor#visit(net.vidageek.crawler.Page)
	 */
	public void visit(Page page) {
		log.debug("===================visit:"+page.getUrl());
//		log.info("===================content:"+paramPage.getContent());
		
		if(! page.getUrl().contains("/zuofa/")){
			return;
		}
		
		Recipe recipe = new Recipe();
		
		Document doc = Jsoup.parse(page.getContent());
		Elements tmp = doc.select("h1"); // 标题
		String buffer ="";
		recipe.setName(tmp.text());
		
		tmp = doc.select("div.cp_headerimg_w > img"); // 成品图
		recipe.setImages(tmp.attr("src"));
		
		tmp = doc.select("span[class=icon icon_nd] ~ a"); // // 难度
		recipe.setRecruit(tmp.text());
		
		tmp = doc.select("li[class=w127 bb0]  a"); // //口味 li class="w127 bb0
		recipe.setTaste(tmp.text());
		
		tmp = doc.select("span[class=icon icon_zb] ~ a"); // // 准备时间
		recipe.setSetuptime(tmp.text());		
		
		tmp = doc.select("span[class=icon icon_pr] ~ a"); // // 烹饪时间
		recipe.setCookingtime(tmp.text());
		
		tmp = doc.select("div[class=yl zl clearfix] h4"); // // 主料
		recipe.setMainingredient(tmp.text());
		
		tmp = doc.select("div[class=yl fuliao clearfix] a"); // // 配料
		if(tmp != null){
			buffer="";
			for(int i=0; i<tmp.size() ;i++){
				buffer += tmp.get(i).text() + " ";
			}
			recipe.setIngredient(buffer);				
		}
		
		
		tmp = doc.select("div.materials > p"); //功能
		recipe.setFuncational(tmp.text());
		
		recipe.setComment(page.getUrl()) ; //备注放url
		SqlSession session = DB.getSession();
		session.insert("dao.RecipeMapper.insert",recipe);
		
		tmp = doc.select("em.step"); // 步骤
		if(tmp != null){
			for(short i=1; i<=tmp.size() ;i++){
				String text = tmp.get(i).parent().text();
				if(text!=null && text.length()>2){
					Step step =  new Step();
					step.setRecipeid(recipe.getRecipeid());
					step.setSteporder( i);
					step.setDescription(text);
					session.insert("dao.StepMapper.insert", step);
				}
			}
		}
		session.close();		
	}

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.PageVisitor#followUrl(net.vidageek.crawler.Url)
	 */
	public boolean followUrl(Url paramUrl) {
		if(!paramUrl.toString().contains("/zuofa/"))
			return false;
		else
			return true;
	}

}

