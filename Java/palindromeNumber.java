package Java;
import java.util.Scanner;

public class palindromeNumber {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int num= sc.nextInt();
        int original= num;

        int count;
        int reverse=0;

        while(num!=0){
            count= num%10;
            reverse= reverse * 10 + count;
            num= num/10;
        }

        if(reverse==original){
                System.out.println(original + " is a Palindrome.");
            }
            else{
                System.out.println(original + " is NOT a Palindrome.");
            }
        sc.close();
    }
}
