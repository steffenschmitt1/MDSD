package DBCache;

import repository.IAudioDB;
import repository.IAudioDB;

public class DBCacheImpl implements IAudioDB {

IAudioDB iAudioDB;
	
//Implementing QueryDB from interface IAudioDB
@Override 
public void QueryDB() {
	// TODO: Insert code here
}
	
//Implementing AddFile from interface IAudioDB
@Override 
public void AddFile() {
	// TODO: Insert code here
}

public void setIAudioDB(IAudioDB iAudioDB) {
	this.iAudioDB = iAudioDB;
}
}
