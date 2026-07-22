package DSA.Arrays;

public class sortedArray {
    public static void main(String args[]){
        int[] num= {10,20,30,50,40};

        for(int i=0; i<num.length-1; i++){
            if(num[i]<num[i+1]){
                System.out.println("Sorted!");
            }
            else{
                System.out.println("Not sorted :/");
            }
        }
    }
}
