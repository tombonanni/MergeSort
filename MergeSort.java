package MergeSort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) throws FileNotFoundException{
		
		Scanner sc = new Scanner(new File("C:/Users/tom/workspace/Sorting Algorithms/src/MergeSort/names.txt"));
		String[] array = new String[88799];
		int n = array.length;
		for(int j = 0; j < n; j++){
			array[j] = sc.nextLine();
			array[j] = array[j].substring(0, array[j].indexOf(' '));
		}
		String[] temp = new String[88799];
		mergeSort(array, temp, n);
		for(int i = 0; i < n; i++){System.out.println(array[i]);}

	}

	public static void mergeSort(int[] array, int[] temp, int n){

		topDownMergeSplit(array, temp, 0, n);

	}

	public static void mergeSort(double[] array, double[] temp, int n){

		topDownMergeSplit(array, temp, 0, n);

	}

	public static void mergeSort(char[] array, char[] temp, int n){

		topDownMergeSplit(array, temp, 0, n);

	}

	public static void mergeSort(String[] array, String[] temp, int n){

		topDownMergeSplit(array, temp, 0, n);

	}

	private static void topDownMergeSplit(int[] array, int[] temp, int start, int end){

		if(end - start < 2)
			return;
		int mid = (end + start)/2;
		topDownMergeSplit(array, temp, start, mid);
		topDownMergeSplit(array, temp, mid, end);
		topDownMerge(array, temp, start, mid, end);
		copyArray(array, temp, start, end);

	}
	
	private static void topDownMergeSplit(double[] array, double[] temp, int start, int end){

		if(end - start < 2)
			return;
		int mid = (end + start)/2;
		topDownMergeSplit(array, temp, start, mid);
		topDownMergeSplit(array, temp, mid, end);
		topDownMerge(array, temp, start, mid, end);
		copyArray(array, temp, start, end);

	}

	private static void topDownMergeSplit(char[] array, char[] temp, int start, int end){


		if(end - start < 2)
			return;
		int mid = (end + start)/2;
		topDownMergeSplit(array, temp, start, mid);
		topDownMergeSplit(array, temp, mid, end);
		topDownMerge(array, temp, start, mid, end);
		copyArray(array, temp, start, end);

	}

	private static void topDownMergeSplit(String[] array, String[] temp, int start, int end){

		if(end - start < 2)
			return;
		int mid = (end + start)/2;
		topDownMergeSplit(array, temp, start, mid);
		topDownMergeSplit(array, temp, mid, end);
		topDownMerge(array, temp, start, mid, end);
		copyArray(array, temp, start, end);

	}

	private static void topDownMerge(int[] array, int[] temp, int start, int mid, int end){

		int i = start, j = mid;

		for(int k = start; k < end; k++){
			if(i < mid && (j >= end || array[i] <= array[j]) ){
				temp[k] = array[i];
				i++;
			}
			else
			{
				temp[k] = array[j];
				j++;
			}
		}
	}

	private static void topDownMerge(double[] array, double[] temp, int start, int mid, int end){

		int i = start, j = mid;

		for(int k = start; k < end; k++){
			if(i < mid && (j >= end || array[i] <= array[j]) ){
				temp[k] = array[i];
				i++;
			}
			else
			{
				temp[k] = array[j];
				j++;
			}
		}
	}

	private static void topDownMerge(char[] array, char[] temp, int start, int mid, int end){

		int i = start, j = mid;

		for(int k = start; k < end; k++){
			if(i < mid && (j >= end || array[i] <= array[j]) ){
				temp[k] = array[i];
				i++;
			}
			else
			{
				temp[k] = array[j];
				j++;
			}
		}
	}

	private static void topDownMerge(String[] array, String[] temp, int start, int mid, int end){

		int i = start, j = mid;

		for(int k = start; k < end; k++){
			if(i < mid && (j >= end || array[i].compareTo( array[j] ) < 0 ) ){
				temp[k] = array[i];
				i++;
			}
			else
			{
				temp[k] = array[j];
				j++;
			}
		}
	}

	private static void copyArray(int[] array, int[] temp, int start, int end){

		for(int i = start; i < end; i++){
			array[i] = temp[i];
		}
	}

	private static void copyArray(double[] array, double[] temp, int start, int end){

		for(int i = start; i < end; i++){
			array[i] = temp[i];
		}
	}

	private static void copyArray(char[] array, char[] temp, int start, int end){

		for(int i = start; i < end; i++){
			array[i] = temp[i];
		}
	}

	private void copyArray(String[] array, String[] temp, int start, int end){

		for(int i = start; i < end; i++){
			array[i] = temp[i];
		}
	}
}
