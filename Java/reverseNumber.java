package Java;
import java.util.Scanner;

public class reverseNumber {
    
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        int count;
        int reverse=0;

        while(num!=0){
            count= num%10;
            reverse= reverse * 10 + count;
            num= num/10;
        }

        System.out.println(reverse);
        sc.close();
    }
}
