package estd;

public class Sorter {

	public void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int cur = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > cur)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
	}


	public void sort(char[] a) {
		for (int i = 1; i < a.length; i++) {
			char cur = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > cur)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
	}
	
	public void sort(String[] a) {
		for (int i = 1; i < a.length; i++) {
			String cur = a[i];
			int j = i - 1;
			while ((j >= 0) && (a[j] > cur)) {
				a[j + 1] = a[j--];
			}
			a[j + 1] = cur;
		}
	}
	
}