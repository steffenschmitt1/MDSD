package MediaManager;

<<<<<<< HEAD
import repository.ISound;
import repository.IAudioDB;
import repository.Helper;

public class MediaManagerImpl  {

ISound iSound;
IAudioDB iAudioDB;

public void setISound(ISound iSound) {
	Helper.assertNull(iSound);
	this.iSound = iSound;
}
public void setIAudioDB(IAudioDB iAudioDB) {
	Helper.assertNull(iAudioDB);
	this.iAudioDB = iAudioDB;
}
=======
import repository.IAudioDB;
import repository.ISound;
import repository.Helper;

public class MediaManagerImpl  {

	ISound iSound;

	IAudioDB iAudioDB;

	public void setISound(ISound iSound) {
		Helper.assertNull(iSound);
		this.iSound = iSound;
	}

	public void setIAudioDB(IAudioDB iAudioDB) {
		Helper.assertNull(iAudioDB);
		this.iAudioDB = iAudioDB;
	}
>>>>>>> refs/remotes/origin/ex04-finish
}
