

public class Sistaforsoket {
//Explanation of what this method is
	static void Sort(int[] arr) {
		int b = arr.length;  //Better variablenames
		int temp = 0;
		for (int i = 0; i < b; i++) { 
			for (int j = 1; j < (b - i); j++) { 
				if (arr[j - 1] > arr[j]) { 
					temp = arr[j - 1]; 
					arr[j - 1] = arr[j];
					arr[j] = temp;  
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a;
		a = new int[100];

		for (int m = 0; m < 100; m++) {
			a[m] = (int) (Math.random() * 1000);
		}
		Sort(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
