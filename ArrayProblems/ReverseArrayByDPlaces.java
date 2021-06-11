import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayByDPlaces {

	public static void main(final String[] args) {
		// Reverse an array by D places - Left shift
		// E.g: {1,2,3,4,5} by 2 places would give 3,4,5,1,2
		// Efficient approach is to reverse the array from 0-d places, reverse
		// from d to n places and then reverse whole array
		/*		Step 1 -  2,1,3,4,5
				Step 2- 2,1,5,4,3
				Step 3 - 3,4,5,1,2*/

		final Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		final int d = sc.nextInt();

		arr = reverse(arr, 0, d - 1);
		arr = reverse(arr, d, n - 1);
		arr = reverse(arr, 0, n - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] reverse(final int[] arr, int x, int d) {
		while (x < d) {
			// swap(arr[x], arr[d]);
			final int temp = arr[x];
			arr[x] = arr[d];
			arr[d] = temp;
			x++;
			d--;
		}
		return arr;
	}

	private static void swap(int i, int j) {
		final int temp = i;
		i = j;
		j = temp;
	}

}
