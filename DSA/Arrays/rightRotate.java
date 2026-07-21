package Arrays;
import java.util.Scanner;

public class rightRotate {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int arr[]= {1,2,3,4,5};

        System.out.println("Enter the position to right rotate: ");
        int k= sc.nextInt();
        int n= arr.length;

        k= k%n;
        for(int i=0; i<k; i++){
            int temp= arr[n-1];

            for(int j= n-1; j>0; j--){
                arr[j]= arr[j-1];
            }

            arr[0]= temp;
        }

        for(int a=0; a<n; a++){
            System.out.print(arr[a] + " ");
        }
        sc.close();
    }
}
