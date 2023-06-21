package MediaManager;

import repository.ISound;
import repository.IAudioDB;

public class MediaManagerImpl  {

ISound iSound;
IAudioDB iAudioDB;

public void setISound(ISound iSound) {
	this.iSound = iSound;
}
public void setIAudioDB(IAudioDB iAudioDB) {
	this.iAudioDB = iAudioDB;
}
}
