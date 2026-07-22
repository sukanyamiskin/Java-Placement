package DSA.Arrays;
import java.util.Scanner;

public class leftRotate {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num[]= {1, 2, 3, 4, 5};
        int n= num.length;

        System.out.println("Enter the position to left rotate: ");
        int k= sc.nextInt();
        k= k %n;

        for(int i=0; i<k; i++){
            int temp= num[0];

            for(int j=0; j<n-1; j++){
                num[j]= num[j+1];
            }

            num[n-1]= temp;
        }

        for(int a=0; a<n; a++){
            System.out.print(num[a] + " ");
        }
        sc.close();

    }
}
