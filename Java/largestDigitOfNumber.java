package Java;
import java.util.*;

public class largestDigitOfNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int original= num;

        int count=0;
        int largest=0;

        while(num!=0){
            count= num%10;
            if(count>largest){
                largest=count;
            }
            num=num/10;
        }

        System.out.println(largest + " is the largest of " +original);
        sc.close();
    }
}
