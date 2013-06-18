import java.io.IOException;
import java.io.InputStream;

import net.vidageek.crawler.ContentVisitor;
import net.vidageek.crawler.Page;
import net.vidageek.crawler.Status;
import net.vidageek.crawler.Url;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import dao.Recipe;
import dao.Recipeallinone;
import dao.Step;

/**
 * wei	2013-5-28
 */

/**
 * The only code you'll usually need to write is a implementation of net.vidageek.crawler.ContentVisitor . This interface provides two methods:
void visit(Page page) : This method is called on each page found on the site.
void onError(Url errorUrl, Status statusError) : This method is called on pages that failed to respond with a Status.OK or Status.REDIRECTION for any reason.
 * @author wei
 *
 */
public class ChinacaiputVisitor implements ContentVisitor {

	Logger log = Logger.getLogger(this.getClass());
	public void visit(Page paramPage) {
		
		Recipeallinone recipe = new Recipeallinone();
		
		// TODO Auto-generated method stub
		log.debug("===================visit:"+paramPage.getUrl());
//		log.info("===================content:"+paramPage.getContent());
		Document doc = Jsoup.parse(paramPage.getContent());
		Elements title = doc.select("h1"); // 标题
		Elements main = doc.select("div#content > p"); // 正文
		
		if(main.isEmpty()){
			log.debug("非菜谱页面,不解析");
		}else {
	    	SqlSession session = DB.getSession();
	    	recipe.setComment(paramPage.getUrl());
			recipe.setName(title.html());
			recipe.setMainimages("http://www.chinacaipu.com"+main.get(0).html().split("\"")[3] );
			recipe.setMainingredient(main.get(2).html());
			
			log.debug(title.html());
			int len = main.size();
			int stepsmark = 4; //
			for (int i = 0; i < stepsmark; i++) {

				// 辅料:
				if (main.get(i).html().startsWith("准备工作：")) {
					recipe.setIngredient(main.get(i).html()
							.replace("准备工作：", ""));
				}
				if (main.get(i).html().startsWith("辅料：")) {
					recipe.setIngredient(main.get(i).html().replace("辅料：", ""));
				}

			}
		    	
		    
			StringBuffer description = new StringBuffer();
	    	for (int j = stepsmark+1; j < len; j++) {
				description.append("|*****|").append(main.get(j).html());
			}
    		recipe.setDescription(description.toString()); //步骤集合

			session.insert("dao.RecipeallinoneMapper.insert",recipe);

       
	    	session.close();

		}

	}
	
//	public void visit(Page paramPage) {   分2个表写的方法
//		
//		Recipe recipe = new Recipe();
//		
//		// TODO Auto-generated method stub
//		log.debug("===================visit:"+paramPage.getUrl());
////		log.info("===================content:"+paramPage.getContent());
//		Document doc = Jsoup.parse(paramPage.getContent());
//		Elements title = doc.select("h1"); // 标题
//		Elements main = doc.select("div#content > p"); // 正文
//		
//		if(main.isEmpty()){
//			log.debug("非菜谱页面,不解析");
//		}else {
//	    	SqlSession session = DB.getSession();
//
//			recipe.setName(title.html());
//			recipe.setImages("http://www.chinacaipu.com"+main.get(0).html().split("\"")[3] );
//			recipe.setMainingredient(main.get(2).html());
//			
//			log.debug(title.html());
//			int len = main.size();
//			int stepsmark = 4; //
//			for (int i = 0; i < stepsmark; i++) {
//				// 原料:
//				// if (main.get(i).html().startsWith("材料：")) {
//				// recipe.setMainingredient(main.get(i).html()
//				// .replace("材料：", ""));
//				// }
//				// if (main.get(i).html().startsWith("<strong>原料</strong>：")) {
//				// recipe.setMainingredient(main.get(i).html()
//				// .replace("<strong>原料</strong>：", ""));
//				// }
//
//				// 辅料:
//				if (main.get(i).html().startsWith("准备工作：")) {
//					recipe.setIngredient(main.get(i).html()
//							.replace("准备工作：", ""));
//				}
//				if (main.get(i).html().startsWith("辅料：")) {
//					recipe.setIngredient(main.get(i).html().replace("辅料：", ""));
//				}
//				// System.out.println("insert recipe id="
//				// +recipe.getRecipeid());
//
//			}
//			session.insert("dao.RecipeMapper.insert",recipe);
//		    	
//		    
//	    	for (int j = stepsmark+1; j < len; j++) {
//				Step step = new Step();
//				step.setRecipeid(recipe.getRecipeid());
//				step.setSteporder((short) (j-stepsmark));
//				step.setDescription(main.get(j).html());
//				session.insert("dao.StepMapper.insert", step);
//			}
//       
//	    	session.close();
//
//		}
//
//	}

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.ContentVisitor#onError(net.vidageek.crawler.Url, net.vidageek.crawler.Status)
	 */
	public void onError(Url paramUrl, Status paramStatus) {
		// TODO Auto-generated method stub
		log.info("===================onError:"+paramUrl + paramStatus.toString());

	}

}

