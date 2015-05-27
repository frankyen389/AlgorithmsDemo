
public class MergeSortExample {

	
	public void doDivide(int intArray[]) {
		int length = intArray.length;
		
		if ((length / 2) > 0 ) {
			if ((length % 2)  > 0) {
				int right = (length / 2) + 1;
				int left = length / 2;
				int rightArray [] = new int[right];
				int leftArray [] = new int[left];
				for (int i=0; i<right; i++) {
					rightArray[i] = intArray[i];
				}
				doDivide(rightArray);
				for (int j=0; j<left; j++) {
					leftArray[j] = intArray[left+j+1];
				}
				doDivide(leftArray);
			} else {
				int right = length / 2;
				int left = length / 2;
				int rightArray [] = new int[right];
				int leftArray [] = new int[left];
				for (int i=0; i<right; i++) {
					rightArray[i] = intArray[i];
				}
				doDivide(rightArray);
				for (int j=0; j<left; j++) {
					leftArray[j] = intArray[left+j];
				}
				doDivide(leftArray);
			}
		} else {
			
		}
		
	}
	
	public void doCompare() {
		
	}
	
	public void doMerge() {
		
	}
	
	public static void main(String[] args) {
		
		MergeSortExample mergeSortExample = new MergeSortExample();
		int intArray[] = {38, 27, 43, 3, 9, 82, 10};
		
		mergeSortExample.doDivide(intArray);
		
	}

}
