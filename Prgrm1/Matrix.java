import java.util.Scanner;
public class Matrix{
	public static void main (String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int i,j;
	 System.out.println("Enter Rows");
	 int m=sc.nextInt();
         System.out.println("Enter Column");
	 int n=sc.nextInt();
	 int[][] mat1=new int[m][n];
         int[][] mat2=new int[m][n];
	 int[][] summat=new int[m][n];
	 System.out.println("Enter first matrix:");
	 for(i=0;i<m;i++){
	 	for(j=0;j<n;j++){
			mat1[i][j]=sc.nextInt();
			}
		}
	System.out.println("Enter second matrix");
	for(i=0;i<m;i++){
	 	for(j=0;j<n;j++){
			mat2[i][j]=sc.nextInt();
			}
		}
	//Addition
	for(i=0;i<m;i++){
	 	for(j=0;j<n;j++){
			summat[i][j]=mat1[i][j] + mat2[i][j];
			}
		}
	System.out.println("Resultant Matrix is:");
	for(i=0;i<m;i++){
	 	for(j=0;j<n;j++){
			System.out.print(summat[i][j]+"\t");
     			}
			System.out.println();
		}
	}
}

	
	 
	 
