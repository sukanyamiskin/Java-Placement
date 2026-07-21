package Arrays;

public class smallestElement {
    public static void main(String args[]){

        int[] numbers= {10, 20, 30, 40, 50};
        int smallest= numbers[0];

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<smallest)
                smallest=numbers[i];
        }

        System.out.println("Smallest number= " + smallest);
    }
}
