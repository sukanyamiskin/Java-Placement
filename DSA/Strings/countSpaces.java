package DSA.Strings;
import java.util.Scanner;

public class countSpaces {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a phrase: ");
        String str= sc.nextLine();
        int gap= 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                gap++;
            }
        }

        System.out.println("Total gaps = " + gap);
        sc.close();
    }
}
