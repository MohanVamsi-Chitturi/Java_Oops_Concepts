import java.util.*;

public class SecondLargestElement {
 
	public static void main(String[] args) {
 
		int size;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:" );	
		size=sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the array elements:" );
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		int largest = arr[0];
		int secondLargest = arr[0];
		for (int i = 0; i < size; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
}