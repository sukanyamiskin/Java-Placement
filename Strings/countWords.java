package Strings;
import java.util.Scanner;

public class countWords {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter words:  ");
        String str= sc.nextLine();
        int gaps= 1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)== ' '){
                gaps= gaps+1;
            }
        }

        System.out.println("Total Words: " + gaps);
        sc.close();
    }
}
