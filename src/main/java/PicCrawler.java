import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;


/**
 * @author wei
 *
 */
public class PicCrawler {
	static Logger log = Logger.getLogger(PicCrawler.class);
	
	public static void main(String[] args) {
		try {
			run();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void run() throws InterruptedException{
	   
		List<String> lines = readURLsFromFile();
		for(String url : lines) {
			if( ! url.contains("/p/")){
				continue;				
			}
			String pathname = "C:\\pic\\" + url.replace("http://images.meishij.net/p/","").replace("/", "-");
			System.out.println("pathname="+pathname);			
			File file = new File(pathname);

			if(!file.exists()){
				HttpClient httpClient = new DefaultHttpClient();
				try {
					//创建HttpGet
					HttpGet httpGet = new HttpGet(url);
					httpGet.addHeader("Referer","http://www.meishij.net");
					//执行get请求
					HttpResponse response = httpClient.execute(httpGet);
					//获取响应实体
					HttpEntity entity = response.getEntity();
	
					System.out.println(response.getStatusLine());
					if (entity != null) {
							FileOutputStream output = new FileOutputStream(file);
							output.write( EntityUtils.toByteArray(entity) );
							Thread.sleep(1000);
					}
				}catch (Exception e) {
					log.error("某个地方有错咯",e);
				}finally{
					//关闭连接，释放资源
					httpClient.getConnectionManager().shutdown();
				}
			}else{
				System.out.println("已经下载过");
				continue;	
			}
		}

	}
	
	
	public static List<String> readURLsFromFile() {
		try {
			InputStream in = PicCrawler.class.getClassLoader().getResourceAsStream("piclist.properties");
			BufferedReader urls = new BufferedReader(new InputStreamReader(in));
			List<String> lines = new ArrayList<String>();
			String line;
			while((line = urls.readLine()) != null) {
				lines.add(line);
			}
			return lines;
		} catch (IOException e) {
			log.error("读取urls文件资源失败",e);
			return new ArrayList<String>();
		}	
	}
}

