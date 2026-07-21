package Arrays;
import java.util.Scanner;

public class searchElement {
    public static void main(String args[]){
        int arr[]= {20, 103, 274, 12};
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter element to search: ");
        int n= sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                System.out.println(n + " is present in the Array.");
            }
        }
        sc.close();
    }
}