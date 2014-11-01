
public class Sort {

	/**
	 * @param args
	 * 
	 * 
	 * 
	 * 
	 */

	public static int[] bubbleSort(int[] arrayToSort) { 
		boolean swapNeeded = true ;

		while (swapNeeded) { 
			swapNeeded = false ;
			for (int i = 0 ; i < arrayToSort.length - 1 ; i++) { 

				if (arrayToSort[i] < arrayToSort[i + 1] ) { 
					int temp = arrayToSort[i + 1]; 
					arrayToSort[i + 1] = arrayToSort[i];
					arrayToSort[i] = temp;
					swapNeeded = true;



				}

			}
		}

		return arrayToSort;
	}
	public static void main(String[] args) {
		int[] sortThis = {2,1,5,3,2};
		bubbleSort(sortThis);
		System.out.println(sortThis.toString());



	}

}

