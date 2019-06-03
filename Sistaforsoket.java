

public class Sistaforsoket {

	static void Sort(int[] arr) {
		int b = arr.length;  // kollar längden på arrayen
		int temp = 0; //temporär integer
		for (int i = 0; i < b; i++) { // I är 0 men så länge den är mindre än arrayen så blir det plus 1
			for (int j = 1; j < (b - i); j++) { // När j är större än längden minus i från förra raden
				if (arr[j - 1] > arr[j]) { // när j blir mindre än j - 1
					temp = arr[j - 1]; // så får temp värdet arr[j-1]
					arr[j - 1] = arr[j];// då flyttar vi om så att arr[j] är arr[j-1]
					arr[j] = temp;//skriver sedan att temp är arr[j]  
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
