import java.io.IOException;

import net.vidageek.crawler.PageCrawler;
import net.vidageek.crawler.config.CrawlerConfiguration;
import net.vidageek.crawler.visitor.DomainVisitor;
import net.vidageek.crawler.visitor.RejectAtDepthVisitor;

/**
 * @author wei
 * Date: 31/05/13
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
//        DoSomething doSomething = new DoSomething();
//        doSomething.execute(Arrays.asList("test123", "test2", "test31238"));
    	String beginUrl = "http://www.meishij.net/chufang/diy/";
//    	String beginUrl = "http://www.chinacaipu.com/menu/jiachangcaipu/"; 
		CrawlerConfiguration cfg = new CrawlerConfiguration(beginUrl);
    	PageCrawler crawler = new PageCrawler(cfg);

    	//crawler.crawl(new RejectAtDepthVisitor(3,new DomainVisitor(beginUrl, new ChinacaiputVisitor())) );
    	crawler.crawl(new RejectAtDepthVisitor(3,new DomainVisitor(beginUrl, new MeishijieVisitor())) );

    	
    	String abc = "<img border=\"0\" src=\"/uploadfile/201305/38089_7if.jpg\">";
//    	String[] split = abc.split("\"");
//    	for(String s:split){
//    			System.out.println(s);
//    	}
//    	
//    	System.out.println("http://www.chinacaipu.com"+abc.split("\"")[3]);
    }
}
