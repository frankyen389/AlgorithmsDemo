package my.sort;

public class MergeSort {

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
	
	public static void main(String[] args) {
		
		int arrayNum[] = {3, 7, 1, 12, 9};
		int sortArray[] = mergeSort(arrayNum);
		
		for (int num: sortArray) {
			System.out.print(num + ", ");
		}
		

	}

}
