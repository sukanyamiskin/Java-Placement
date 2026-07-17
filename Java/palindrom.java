package Java;
import java.util.Scanner;

public class palindrom{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a String or an Integer: ");
        String str= sc.nextLine();

        String reverse= "";

        for(int i = str.length() -1; i>=0; i--){
            reverse= reverse + str.charAt(i);
        }

        if(reverse.equals(str)){
                System.out.println(str + " is a Palindrome.");
            }
            else{
                System.out.println(str + " is NOT a Palindrome.");
            }
        sc.close();
    }
}
