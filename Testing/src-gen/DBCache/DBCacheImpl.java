package DBCache;

import repository.IAudioDB;
import repository.Helper;

public class DBCacheImpl implements IAudioDB {

	IAudioDB iAudioDB;

	//Implementing QueryDB from interface IAudioDB
	@Override 
	public void QueryDB() {
		Helper.assertNotNull(iAudioDB);
		// TODO: Insert code here
	}

	//Implementing AddFile from interface IAudioDB
	@Override 
	public void AddFile() {
		Helper.assertNotNull(iAudioDB);
		// TODO: Insert code here
	}

	public void setIAudioDB(IAudioDB iAudioDB) {
		Helper.assertNull(iAudioDB);
		this.iAudioDB = iAudioDB;
	}
}
