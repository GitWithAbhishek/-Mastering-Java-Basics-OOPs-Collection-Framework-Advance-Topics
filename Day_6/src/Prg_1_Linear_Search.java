import java.util.Scanner;

public class Prg_1_Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int key,flag=-1;
        System.out.println("Enter The Key Element To Find In The Array - ");
        key=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                flag=1;
                System.out.println("Element Is Found");
                break;
            }
        }
        if(flag==-1){
            System.out.println("Element Is Not Present In The Array");
        }

    }
}
