package repository;

public class Helper {
	
	public static void assertNotNull(Object object) {
		if(object == null) {
			throw new NullPointerException();
		}
	}
	
	public static void assertNull(Object object) {
		if(object != null) {
			throw new IllegalArgumentException();
		}	
	}
	
}
