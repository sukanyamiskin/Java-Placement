package Arrays;

public class reverseArray {
    public static void main(String args[]){

        int[] num= {10, 20, 30, 40};
        int n= num.length;

        int left=0;
        int right= n-1;

        while(left<right){

            int temp= num[left];
            num[left]= num[right];
            num[right]= temp;

            left++;
            right--;
        }
       
        for(int i=0; i<n; i++){
            System.out.print(num[i]+ " ");
        }
    }
}
