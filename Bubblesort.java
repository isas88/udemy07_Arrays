package udemy07_Arrays;

public class Bubblesort {


	public static void main(String[] args) {
		int a[] = {1,2,3,4,6,5};
		//{5,1,6,2,4,3};
		int temp;
		int incr = 0;
		boolean flag;
		for (int i=0; i<6; i++) {
			flag = false;
			for (int j=0;j<6-i-1;j++) {
				incr++;
				if (a[j]>a[j+1]) {
					flag = true;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			if (flag == false) {
				break;
			}
		}
		System.out.println(incr);
		for (int i=0;i<6;i++) {
			System.out.println(a[i]);
		}
	}

}
