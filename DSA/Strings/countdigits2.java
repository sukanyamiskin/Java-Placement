package DSA.Strings;
import java.util.Scanner;

public class countdigits2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str= sc.nextLine();
        int count=0;

        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);

            if(ch>='0' && ch<='9'){
                count++;
            }
        }
        System.out.println("Total digits in the String = " +count);
        sc.close();
    }
}
