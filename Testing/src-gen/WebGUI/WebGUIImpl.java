package WebGUI;

import repository.IMediaStore;
import repository.IHTTP;

public class WebGUIImpl implements IHTTP {

IMediaStore iMediaStore;
	
//Implementing HTTPDownload from interface IHTTP
@Override 
public void HTTPDownload(String testparam, int testparam2) {
	// TODO: Insert code here
}
	
//Implementing HTTPUpload from interface IHTTP
@Override 
public void HTTPUpload() {
	// TODO: Insert code here
}

public void setIMediaStore(IMediaStore iMediaStore) {
	this.iMediaStore = iMediaStore;
}
}
