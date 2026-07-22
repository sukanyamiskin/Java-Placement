package DSA.Arrays;

public class averageArray {
    public static void main(String args[]){

        int num[]= {10, 20, 30, 40, 50};
        int sum=0;
        int res=0;
        int avg=0;
        
        for(int i=0; i<num.length; i++){
            sum= sum+num[i];
            res= sum;
        }
        avg= res/5;
        System.out.println("Average= "+avg);
    }
}
