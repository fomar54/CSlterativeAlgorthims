// C_bUBLEsort.java



package CSIterativeAlgorthims;
import java.util.ArrayList;
import java.util.Collection;

public class C_BubleSort {
	public ArrayList<Integer> list = new ArrayList<Integer>();
	
	
	
	public static void bubbleSort(int list[]) {
		int temp;
		boolean swapped;
		
		for(int i = 0; i < list.length; i++ ) {
			swapped = false ;
			for (int j =0; j< list.length - i - 1;j++) {
				if(list[j]> list[j+1]) {
					temp = list[j];
					list[j] = list[j+1];
					list[j+1]= temp;
				swapped = true;
					
					
				}
				
			}
			// nothing swapped 
			if (!swapped)
				break;
			
		}
			
	}
	public static void printArray(int print[] ){
		for (int i = 0; i< print.length; i++ )
			System.out.println(print[i] + "");
		System.out.println("");
		
		
	}
	

	public static void main(String[] args) {
		
		
		int [] myList = {78, 89, 348,237,37,89 };
		
		int n = myList.length;
		bubbleSort(myList);
System.out.println("Sorted Array:");
		printArray(myList);

	}

}
