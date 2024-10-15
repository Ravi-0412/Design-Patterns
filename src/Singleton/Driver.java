package Singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
public class Driver {
	
	public static void main(String[] args) {
		
		TvSet tvSetForMember1 = TvSet.getTvSetInstance();
		
		TvSet tvSetForMember2 = TvSet.getTvSetInstance();
		
		System.out.println(tvSetForMember1);
		System.out.println(tvSetForMember2);
		
		// both will print the same address space i.e same object.
		// constructor will be only called once
		
	}

}
*/

// checking above code in multithreading environment

// will fail.
// No of times constructor can be called from '1' to 'n'(no of threads).

public class Driver {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		executor.execute(() -> TvSet.getTvSetInstance());
		executor.execute(() -> TvSet.getTvSetInstance());
		executor.execute(() -> TvSet.getTvSetInstance());
	}
}