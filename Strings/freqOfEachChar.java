package Strings;
import java.util.Scanner;

public class freqOfEachChar {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str= sc.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i){
            int count=0;

            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " = " + count);
        }
    }

        sc.close();
    }
}
