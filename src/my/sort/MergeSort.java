package my.sort;

public class MergeSort {

	private int[] array;
	private int[] tempMergArr;
	private int length;
	
	/**
	public static int[] mergeSort(int arrayNum[]) {
		
		int leftArray[] = null;
		
		int rightArray[] = null;
		
		int len = arrayNum.length;
		
		int mode = len % 2;
		
		int num = len / 2;
		
		if (mode != 0 && len != 1) {
			
			leftArray = new int[num+1];
			for (int i=0; i<leftArray.length; i++) {
				leftArray[i] = arrayNum[i];
			}
			
			rightArray = new int[num];
			for (int i=num+1,j=0; i<len; i++,j++) {
				rightArray[j] = arrayNum[i];
			}
			
			leftArray = mergeSort(leftArray);
			
			rightArray = mergeSort(rightArray);
			
			
			
		} else if (mode == 0) {
			
			leftArray = new int[num];
			for (int i=0; i<leftArray.length; i++) {
				leftArray[i] = arrayNum[i];
			}
			
			rightArray = new int[num];
			for (int i=num,j=0; i<len; i++,j++) {
				rightArray[j] = arrayNum[i];
			}
			
			leftArray = mergeSort(leftArray);
			
			rightArray = mergeSort(rightArray);
			
			
		} else if (len == 1) {
			return arrayNum;
		}
		
		arrayNum = merge(leftArray, rightArray);
		
		return arrayNum;
		
	}
	
	public static int[] merge(int leftArray[], int rightArray[]) {
	
		int tempArray[] = new int[leftArray.length + rightArray.length];
		
		for (int i=0; i<leftArray.length; i++) {
			tempArray[i] = leftArray[i];
		}
		
		for (int j=0, k = leftArray.length; j<rightArray.length; j++, k++) {
			tempArray[k] = rightArray[j];
		}
		
		
		int temp = 0;
		for (int k=leftArray.length; k<tempArray.length; k++) {
			
			for (int i=0; i<k; i++) {
				if (tempArray[k] < tempArray[i]) {
					temp = tempArray[i];
					tempArray[i] = tempArray[k];
					tempArray[k] = temp;
				}
			}
			
			
		}
		
		return tempArray;
	}
	*/
	
	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {

		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// Below step sorts the left side of the array
			doMergeSort(lowerIndex, middle);
			// Below step sorts the right side of the array
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergeParts(lowerIndex, middle, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middle, int higherIndex) {

		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempMergArr[i] <= tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
	
	public static void main(String[] args) {
		
		
		
		/**
		int arrayNum[] = {3, 7, 1, 12, 9};
		int sortArray[] = mergeSort(arrayNum);
		
		for (int num: sortArray) {
			System.out.print(num + ", ");
		}
		*/
		
		int[] inputArr = { 32, 27, 43, 3, 9, 82, 10 };
		MergeSort mms = new MergeSort();
		mms.sort(inputArr);
		for (int i : inputArr) {
			System.out.print(i);
			System.out.print(" ");
		}
		

	}

}
