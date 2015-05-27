
public class SelectionSortDemo {
	
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
	
	public static void main(String[] args) {
		
		//int arrayNum[] = {8, 2, 5, 1, 7, 4};
		
		//int arrayNum[] = {1, 3, 4, 2};
		
		//int arrayNum[] = {2, 3, 6};
		
		//int arrayNum[] = {1, 3, 6, 9, 2, 7};
		
		//int arrayNum[] = {5, 3, 4, 2};
		
		int arrayNum[] = {8, 2, 1};
		
		int sortArrayNum[] = selectionSort(arrayNum);
		
		for (int i=0; i<sortArrayNum.length; i++) {
			System.out.print(sortArrayNum[i] + ", ");
		}

	}

}
