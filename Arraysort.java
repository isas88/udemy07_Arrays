package udemy07_Arrays;

import java.util.Scanner;

//my version of bubble sort :) 

public class Arraysort {


	private static Scanner scan = new Scanner(System.in);
	
				
	public static void main(String[] args) {
	
		System.out.println("Enter the length of the array: ");
		int len = scan.nextInt();
		int[] arrayInput = new int[len];
		
		System.out.println("Enter " +len +" array elements ");
		
		getIntegers(arrayInput);
		//int[] arrayInput = {1,2,3,4,6,5};
		sortArray(arrayInput);
		printArray(arrayInput);
		/*
		int[] arrayInput = {1,2,3,1,2};
		arrayInput = sortArrayDesc(arrayInput);
		printArray(arrayInput);
		
		System.out.println("**********************End*****************");
		
		//to copy array to another array by mentioning a length
		//int[] array3 = new int[2];
		int[] array3 = {91,92};
		System.out.println("array3[1] :" +array3[1]);
		System.out.println("array3 Length :" +array3.length);
		
		int[] array2 = Arrays.copyOf(arrayInput, 3);
		array3=arrayInput;
		System.out.println("*******************Array2*****************");
		printArray(array2);
		
		System.out.println("*******************Array3*****************");
		System.out.println("array3[1] :" +array3[1]);
		System.out.println("array3 Length :" +array3.length);
		printArray(array3);
		System.out.println("**********************End*****************");
		*/
		}

	public static void getIntegers(int[] array) {

		for (int i=0;i<array.length;i++) {
			array[i] = scan.nextInt();
				
		}
		//return array;
	}

	public static void printArray(int[] array) {
		for (int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		}
	
	public static int[] sortArray(int[] array) {
		int tmp;
		int incr=0;
		for (int i=0;i<array.length;i++) {
			for (int j=i+1;j<array.length;j++) {
				incr ++;
				if (array[j] < array[i]) {
					tmp  = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println(incr);
		return array;
	}
	
	
	public static int[] sortArrayDesc(int[] array) {
		
		int temp = 0;
		char sorted_once ='N';
		int incr= 0;
		
		for (int i=0;i<array.length;i++) {
			sorted_once = 'N';
			for (int j=0;j<array.length-i-1;j++) {
				incr++;
				if (array[j] < array[j+1]) {
					sorted_once = 'Y';
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
			if (sorted_once == 'N'){
				break;
			}
		}
	System.out.println("incr :" +incr);
	return array;
	}
	
}
