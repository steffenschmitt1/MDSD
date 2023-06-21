package MediaStore;

import repository.IAudioDB;
import repository.IMediaStore;
import repository.Helper;

public class MediaStoreImpl implements IMediaStore {

IAudioDB iAudioDB;

//Implementing download from interface IMediaStore
@Override 
public void download() {
Helper.assertNotNull(iAudioDB);
	// TODO: Insert code here
}

//Implementing upload from interface IMediaStore
@Override 
public void upload() {
Helper.assertNotNull(iAudioDB);
	// TODO: Insert code here
}

public void setIAudioDB(IAudioDB iAudioDB) {
	Helper.assertNull(iAudioDB);
	this.iAudioDB = iAudioDB;
}
}
