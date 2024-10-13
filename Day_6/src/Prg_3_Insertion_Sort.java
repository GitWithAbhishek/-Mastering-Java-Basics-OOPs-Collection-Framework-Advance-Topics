public class Prg_3_Insertion_Sort {
    public static void main(String[] args) {
        int [] arr = {12,4,67,3,45,22,98,10,1,49,100};
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0 && arr[j-1] > arr[j];j--){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        System.out.println("Printing The Sorted Array Using Insertion Sort");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
