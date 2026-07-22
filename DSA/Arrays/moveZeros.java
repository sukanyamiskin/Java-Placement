package DSA.Arrays;

public class moveZeros {
    public static void main(String args[]){

        int arr[]= {1,2,3,0,4};
        int temp=0;

        for(int i=0; i<=arr.length-1; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[i]==0 && arr[j]!=0){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
