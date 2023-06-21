package MediaStore;

import repository.IAudioDB;
import repository.IMediaStore;

public class MediaStoreImpl implements IMediaStore {

IAudioDB iAudioDB;
	
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

public void setIAudioDB(IAudioDB iAudioDB) {
	this.iAudioDB = iAudioDB;
}
}
