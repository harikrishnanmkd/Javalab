import java.util.Scanner;
class BubbleSort {
public static void main(String []args) {
int n, c, d, swap;
Scanner in = new Scanner(System.in);
System.out.println("Input number of values to sort");
n = in.nextInt();
int array[] = new int[n];
System.out.println("Enter " + n + " values");
for (c = 0; c < n; c++) 
array[c] = in.nextInt();
for (c = 0; c < ( n - 1 ); c++) {
for (d = 0; d < n - c - 1; d++) {
if (array[d] > array[d+1]) 
/* For descending order use < */ {
swap = array[d];
array[d]= array[d+1];
array[d+1] = swap;
}
}
}
System.out.println("After sorting :");
for (c = 0; c < n; c++) 
System.out.println(array[c]);
}
}


