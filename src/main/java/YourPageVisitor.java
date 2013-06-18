import net.vidageek.crawler.Page;
import net.vidageek.crawler.PageVisitor;
import net.vidageek.crawler.Status;
import net.vidageek.crawler.Url;

/**
 * wei	2013-5-28
 */

/**
 * @author wei
 *
 */
public class YourPageVisitor implements PageVisitor {

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.ContentVisitor#onError(net.vidageek.crawler.Url, net.vidageek.crawler.Status)
	 */
	public void onError(Url arg0, Status arg1) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.ContentVisitor#visit(net.vidageek.crawler.Page)
	 */
	public void visit(Page arg0) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see net.vidageek.crawler.PageVisitor#followUrl(net.vidageek.crawler.Url)
	 */
	public boolean followUrl(Url arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}

