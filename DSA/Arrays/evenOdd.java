package DSA.Arrays;

public class evenOdd {
    public static void main(String args[]){
        int arr[]= {7, 4, 8, 7, 5};
        int n= arr.length;
        int even=0;
        int odd=0;

        for(int i=0; i<n; i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        System.out.println("Even= "+even);
        System.out.println("Odd= "+odd);
    }
}
