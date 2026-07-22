package DSA.Arrays;

public class missingElement {
    public static void main(String args[]){
        int[] arr= {1,2,4,5};
        int m=arr.length+1;
        int n=arr.length;

        int xor1=0; //xor of numbers from 1 to n
        int xor2=0; //xor of array

        for(int i=0; i<=m; i++){
            xor1= xor1^i;
        }

        for(int i=0; i<n; i++){
            xor2= xor2^arr[i];
        }

        int missing= xor1^xor2;
        System.out.println(missing);
    }
}
