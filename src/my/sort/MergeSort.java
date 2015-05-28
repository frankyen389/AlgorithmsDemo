package my.sort;

public class MergeSort {

	public static int[] mergeSort(int arrayNum[]) {
		
		int len = arrayNum.length;
		int left, right;
		if (len > 1) {
			if ((len % 2) != 0) {
				left = (len / 2) + 1;
				right = len - left;
			}
		}
		
		return arrayNum;
	}
	
	public static void main(String[] args) {
		
		int arrayNum[] = {38, 27, 43, 3, 9, 82, 10};
		mergeSort(arrayNum);

	}

}
