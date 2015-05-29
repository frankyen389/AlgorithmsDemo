package my.sort;

public class MergeSort {

	public static int[] mergeSort(int arrayNum[]) {
		
		int len = arrayNum.length;
		int left, right;
		if (len > 1) {
			if ((len % 2) != 0) {
				left = (len / 2) + 1;
				right = len - left;
			} else {
				left = len / 2;
				right = len - left;
			}
			
			int leftArray [] = new int[left];
			int rightArray [] = new int[right];
			for (int i=0; i<left; i++) {
				leftArray[i] = arrayNum[i];
			}
			
			for (int j=0; j<right; j++) {
				rightArray[j] = arrayNum[left];
			}
			
			mergeSort(leftArray);
			
			mergeSort(rightArray);
			
			merge(leftArray, rightArray);
			
		} else {
			return arrayNum;
		}
		
		return arrayNum;
		
	}
	
	public static int[] merge (int leftArray[], int rightArray[]) {
		int len = leftArray.length + rightArray.length;
		int temp[] = new int[len];
		for (int i=0; i<rightArray.length; i++) {
			for (int j=0; j<leftArray.length; j++) {
				
			}
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		
		int arrayNum[] = {38, 27, 43};
		mergeSort(arrayNum);

	}

}
