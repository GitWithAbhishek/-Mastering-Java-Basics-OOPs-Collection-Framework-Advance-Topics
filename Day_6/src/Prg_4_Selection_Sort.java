public class Prg_4_Selection_Sort {
    public static void main(String[] args) {
        int [] arr = {12,4,67,3,45,22,98,10,1,49,100};
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Printing The Sorted Array Using Selection Sort ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
