public class Prg_5_Bubble_Sort {
    public static void main(String[] args) {
        int [] arr = {12,4,67,3,45,22,98,10,1,49,100};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Printing The Sorted Array Using Bubble Sort ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
