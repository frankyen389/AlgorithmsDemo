package my.sort;

public class SelectionSortDemo {
	
	/**
	public static int[] selectionSort (int arrayNum[]) {
		
		int index = 0;
		for (int i=0; i<arrayNum.length-1; i++) {
			int temp = arrayNum[i];
			
			for (int j=i+1; j<arrayNum.length; j++) {
				if (arrayNum[i] > arrayNum[j]) {
					if (arrayNum[j] < temp) {
						temp = arrayNum[j];
						index = j;
					}
					
				} 
			}
			
			arrayNum[index] = arrayNum[i];
			arrayNum[i] = temp;
			index = i +1;
		}
		
		return arrayNum;
		
	}
	*/
	
    public static int[] selectionSort (int arrayNum[]) {
		
    	int i, j, minIndex, tmp;
        int n = arrayNum.length;
        for (i = 0; i < n - 1; i++) {
              minIndex = i;
              for (j = i + 1; j < n; j++)
                    if (arrayNum[j] < arrayNum[minIndex])
                          minIndex = j;
              if (minIndex != i) {
                    tmp = arrayNum[i];
                    arrayNum[i] = arrayNum[minIndex];
                    arrayNum[minIndex] = tmp;
              }
        }
		
		return arrayNum;
		
	}
	
	public static void main(String[] args) {
		
		//int arrayNum[] = {8, 2, 5, 1, 7, 4};
		
		//int arrayNum[] = {1, 3, 4, 2};
		
		//int arrayNum[] = {2, 3, 6};
		
		//int arrayNum[] = {1, 3, 6, 9, 2, 7};
		
		//int arrayNum[] = {5, 3, 4, 2};
		
		//int arrayNum[] = {8, 2, 1};
		
		//int arrayNum[] = {1,3,5,6,8,7,2,4};
		
		//int arrayNum[] = {57, 90, 80, 48, 35, 91, 1, 83, 32, 53};
		
		int arrayNum[] = {12,23,13,16,7,9,5,4,38,33,42,98,67,54,49,79,84};
		
		int sortArrayNum[] = selectionSort(arrayNum);
		
		for (int i=0; i<sortArrayNum.length; i++) {
			System.out.print(sortArrayNum[i] + ", ");
		}

	}

}
