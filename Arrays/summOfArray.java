package Arrays;

public class summOfArray {
    public static void main(String args[]){
        int[] arr= {10,20,30,40,50};
        int sum=0;
        int res=0;
        
        for(int i=0; i<arr.length; i++){
            sum= sum+arr[i];
            res= sum;
        }
        
        System.out.println("Sum= "+res);
    }
}
