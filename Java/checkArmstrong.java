package Java;
import java.util.Scanner;

public class checkArmstrong {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= sc.nextInt();

        int original= num;
        int count;
        int sum=0;

        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
}

        while(num!=0){
            count= num%10;
            sum= sum+ (int)Math.pow(count, digits);
            num= num/10;
        }

        if(sum == original){
            System.out.println("Armstrong"); 
        }
        else{
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
