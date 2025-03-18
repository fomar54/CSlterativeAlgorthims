// A_LinearSearch.java 
/* 
 * Title: Linear seearch 
 * Author Fatima Omar 
 * Date may 2, 2024
 */


package CSIterativeAlgorthims;
import java.util.Random;
import java.util.ArrayList;

public class A_LinearSearch {


	public static void main(String[] args) {
			Random rand = new Random();
			ArrayList<Integer > numbers = new ArrayList<Integer>();
			
			for (int i = 0; i< 10000000; i++) {
				if(rand.nextInt(2)== 1) {
					numbers.add(i);
					
				}
			}
		
			int runs= 30;
			double[] times = new double[runs];
			double startTime;
			double endtime;
			double totalTime;
			System.out.println(numbers.size());
			 for (int i = 0; i < runs; i++) {
				 startTime = System.nanoTime();
				 int target = numbers.get(rand.nextInt(numbers.size()));
				 for (int j = 0 ; j < numbers.size(); j++ ) {
					 if (numbers.get(j) == target) {
						 System.out.println("Found target !");
						 break;
						 
					 }
					 endtime = System.nanoTime();
					 totalTime = endtime - startTime ;
					 times[i]= totalTime;
				 }
				 
				 
			 }
			 double average =0;
			 for (int i = 0; i< times.length; i++) {
				 System.out.println(times[i]);
				 average += times[i];
					 
			 }
			 average = average /times.length;
			 
			 System.out.println("Average time:" + average );
			 
	
	
	}

}
