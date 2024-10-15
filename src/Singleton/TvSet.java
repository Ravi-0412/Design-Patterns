
package Singleton;

public class TvSet {
	
	// just like a flag
	private static volatile TvSet tvSetInstance = null; // to return a single instance
	
	private TvSet() {
		System.out.println("Tv set instantiated");
	}
	
	/*
	public static TvSet getTvSetInstance( ) {
		if(tvSetInstance == null)
			tvSetInstance = new TvSet();
		return tvSetInstance;
		
	}
	*/
	
	// implementing 'getTvSetInstance( )' for multithreading environment.
	// But still it won't work.
	
	/*
	public static TvSet getTvSetInstance( ) {
		if(tvSetInstance == null)
			// thread1, thread2
			synchronized (TvSet.class) { 
				tvSetInstance = new TvSet();
			}
		// say some very heavy work 
		return tvSetInstance;
		
	}
	*/
	
	// final way of resolving issue in multithreading
	// Double checking / Double locking
	
	public static TvSet getTvSetInstance( ) {
		if(tvSetInstance == null) {  // optimisation
			// thread1, thread2
			synchronized (TvSet.class) {
				if(tvSetInstance == null)  // Double checking
					tvSetInstance = new TvSet();
			}
		}
		// say some very heavy work 
		return tvSetInstance;
		
	}
}
