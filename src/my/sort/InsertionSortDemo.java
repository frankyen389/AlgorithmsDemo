package my.sort;

public class InsertionSortDemo {

	/**
	public static int[] insertionSort (int numArray[]) {
		
		for (int i=1; i<numArray.length; i++) {
			for (int j=i-1; j<i && j>=0; i--,j--) {
				if (numArray[i] < numArray[j]) {
					int k = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = k;
				} else {
					break;
				}
			}
		}
		
		return numArray;
	}
	*/
	
    public static int[] insertionSort (int numArray[]) {
		
		for (int i=1; i<numArray.length; i++) {
			int k = numArray[i];			
			int j = i;
			while (j>0 && k<numArray[j-1]) {
				numArray[j] = numArray[j-1];
				j--;
			}
			numArray[j] = k;
		}
		
		return numArray;
	}
	
	
	public static void main(String[] args) {
		
		//int numArray[] = {1,3,5,6,8,7,2,4};
		
		//int numArray[] = {84,69,76,86,94,91};
		
		//int numArray[] = {3,1,2};
		
		//int numArray[] = {57, 90, 80, 48, 35, 91, 1, 83, 32, 53};
		
		//int numArray[] = {12,23,13,16,7,9,5,4,38,33,42,98,67,54,49,79,84};
		
		int numArray[] = {1,3,7,9,2,12};
		
		int numArraySort[] = insertionSort(numArray);
		
		for (int num : numArraySort) {
			System.out.print(num + ", ");
		}

	}

}
