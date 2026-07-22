package DSA.Strings;
import java.util.Scanner;

public class checkPalindrome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a string to check Palindrome: ");
        String str= sc.nextLine();

        String reverse= "";
        for(int i= str.length()-1; i>=0; i--){
            reverse= reverse + str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println(str + " is a PALINDROME.");
        }
        else{
            System.out.println(str + " is NOT a PALINDROME.");
        }
        sc.close();
    }
}
