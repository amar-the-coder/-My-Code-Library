package arrays;
import java.util.*;
public class countOccurenceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int size= sc.nextInt();
		int arr[] = new int[size];
		int n;
		int count = 0;
		for (int i = 0; i < size; i++)
			arr[i]=sc.nextInt();
		
		System.out.print("Enter the number you want to search - ");
		n = sc.nextInt();
		{
		for (int i = 0; i < size; i++)
		if (n == arr[i])
		{
		count++;
		} }

		System.out.println("Contents of the array: ");
		for (int i = 0; i < size; i++)
		System.out.print(arr[i]+" ");

		System.out.println("\nNumber of occurrence of '"+n+"' in the array is "+count);
	}

}
