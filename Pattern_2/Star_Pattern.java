import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i =1;
        while(i<=N){
            int spaces=1;
            while(spaces<=N-i){
                System.out.print(" ");
                spaces++;
            }
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            int k=1;
            while(k<=i-1){
                System.out.print("*");
                k++;
            }
        System.out.println();
            i++;
        }
		
		
	}

}
