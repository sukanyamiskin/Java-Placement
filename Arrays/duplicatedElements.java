package Arrays;

public class duplicatedElements {
    public static void main(String args[]){

        int[] num= {5,8,3,7};
        boolean found=false;

        for(int i=0; i<num.length-1; i++){
            for(int j=i+1; j<=num.length-1; j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                }
            }
        }
        if(!found){
    System.out.println("No duplicates");
}
    }
}
