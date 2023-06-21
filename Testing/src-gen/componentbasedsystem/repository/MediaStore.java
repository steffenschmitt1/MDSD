package componentbasedsystem.repository;
public class MediaStore implements IMediaStore {
	
	IMediaStore iMediaStore;
	
	//Implementing download from interface IMediaStore
	@Override 
	public void download() {
		// TODO: Insert code here
	}
	
	//Implementing upload from interface IMediaStore
	@Override 
	public void upload() {
		// TODO: Insert code here
	}

	public void setIMediaStore(IMediaStore iMediaStore) {
		this.iMediaStore = iMediaStore;
	}
}
