package WebGUI;

<<<<<<< HEAD
import repository.IMediaStore;
import repository.IHTTP;
import repository.Helper;

public class WebGUIImpl implements IHTTP {

IMediaStore iMediaStore;

//Implementing HTTPDownload from interface IHTTP
@Override 
public void HTTPDownload(String testparam, int testparam2) {
Helper.assertNotNull(iMediaStore);
	// TODO: Insert code here
}

//Implementing HTTPUpload from interface IHTTP
@Override 
public void HTTPUpload() {
Helper.assertNotNull(iMediaStore);
	// TODO: Insert code here
}

public void setIMediaStore(IMediaStore iMediaStore) {
	Helper.assertNull(iMediaStore);
	this.iMediaStore = iMediaStore;
}
=======
import repository.IHTTP;
import repository.IMediaStore;
import repository.Helper;

public class WebGUIImpl implements IHTTP {

	IMediaStore iMediaStore;

	//Implementing HTTPDownload from interface IHTTP
	@Override 
	public void HTTPDownload(String testparam, int testparam2) {
		Helper.assertNotNull(iMediaStore);
		// TODO: Insert code here
	}

	//Implementing HTTPUpload from interface IHTTP
	@Override 
	public void HTTPUpload() {
		Helper.assertNotNull(iMediaStore);
		// TODO: Insert code here
	}

	public void setIMediaStore(IMediaStore iMediaStore) {
		Helper.assertNull(iMediaStore);
		this.iMediaStore = iMediaStore;
	}
>>>>>>> refs/remotes/origin/ex04-finish
}
