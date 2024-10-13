import java.util.Scanner;

public class Prg_2_Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int key,flag=-1,start=0,end=arr.length-1,mid;
        System.out.println("Enter The Key Element To Find In The Array - ");
        key=sc.nextInt();
        while(start<=end){
            mid=(start+end)/2;
            if(key==arr[mid]){
                flag=1;
                System.out.println("Found The Element In The Array");
                break;
            }
            if(key<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        if(flag==-1){
            System.out.println("Element Is Not Present In The Array");
        }

    }
}
