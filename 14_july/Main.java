public class Main{
    public static int findMaxElement(int [] arr){
        int max=arr[0];

        for (int i=1;i<arr.length;i++){
        if (arr[i]>max){
            max=arr[i];
        }}
        return max;

    }
    public static void main(String[] args) {

        int [] input={5,7,9,13,45,68,43,2,10};

        int output=findMaxElement(input);
        System.out.println(" this is the max element in this array :"+ output);
    }
}