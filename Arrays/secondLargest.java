package Arrays;

public class secondLargest {
    public static void main(String args[]){

        int num[]= {10,20,30,40,50};

        int largest= Integer.MIN_VALUE;
        int secLargest= Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            if(num[i]>largest){
                secLargest= largest;
                largest= num[i];
            }
        }
        System.out.println("Second largest= "+secLargest);
    }
}