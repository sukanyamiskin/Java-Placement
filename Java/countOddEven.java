package Java;
import java.util.Scanner;

public class countOddEven {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num= sc.nextInt();

        int count;
        int even=0;
        int odd=0;

        while(num!=0){
            count= num%10;

            if(count%2==0){
                even++;
            }
            else{
                odd++;
            }
            
            num=num/10;
        }

        System.out.println("even digits are " +even);
        System.out.println("odd digits are " +odd);
        sc.close();
    }
}
