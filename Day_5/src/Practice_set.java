import java.util.Scanner;

public class Practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //Question 1) Create an Array Of 5 Floats And Calculate Their Sum
    float [] one = {1.01f,2.43f,54.33f,9.65f,4.5f} ;
    float sum = 0.0f;
    for(int i=0;i<5;i++){
        sum = sum + one[i];
    }
    System.out.println("The Sum Of Float Array Is = "+sum );

    //Question 2) Write a Program To Find Out Whether A Given Integer Is Present In An Array Or Not (Searching)
    int [] two = {8,5,7,4,9,2,5,34,87,12} ;
    int flag=-1;
        System.out.println("Enter The Number You Want TO Find In The Array");
    int key=sc.nextInt();
    for(int i=0;i<two.length;i++){
        if(key==two[i]){
            System.out.println("Found The Value");
            flag=1;
            break;
        }
    }
    if(flag==-1) {
        System.out.println("Number Is Not Present In The Array");
    }

    //Question 3) Calculate The Average Marks From An Array Containing Marks Of All Students In Physics Using For Each Loop
    int [] marks = {88,82,99,93,95,91,50,42};
    int total=0;
    for(int a:marks){
        total += a;
    }
    System.out.println("The Average Marks Are = "+(total)/marks.length);

    //Question 4) Create a java program To Add Two Matrices Of Size 2x3
    int [][] mat1=new int[2][3];
    int [][] mat2=new int[2][3];
    mat1[0][0]=1;
    mat1[0][1]=2;
    mat1[0][2]=3;
    mat1[1][0]=4;
    mat1[1][1]=5;
    mat1[1][2]=6;
    mat2[0][0]=1;
    mat2[0][1]=2;
    mat2[0][2]=3;
    mat2[1][0]=4;
    mat2[1][1]=5;
    mat2[1][2]=6;

    int [][] Result=new int[2][3];
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            Result[i][j]=mat1[i][j]+mat2[i][j];
        }
    }
    for(int i=0;i<2;i++){
        for(int j=0;j<3;j++){
            System.out.print(Result[i][j]+" ");
        }
        System.out.println();
    }

    //Question 5) Write A java Program To Reverse An Array
    int [] arr = {1,2,3,4,5,6,7,8,9,10};
    int temp;
    int start=0,end=arr.length-1;
    while(start<=end){
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println();

    //Question 6) Write A Java Program To Find Out The Maximum Element Present In The Array
        int [] brr={32,6554,778,65,43,6,787,54,33,28,7,4,56};
        int max = brr[0];
        for(int i=0;i<brr.length;i++){
            if(max<brr[i]){
                max=brr[i];
            }
        }
        System.out.println("The Maximum Element Present In The Array Is = "+max);


    //Question 7) Write A Java Program To Find Out The Maximum Element Present In The Array
    int [] crr={56,87,32,47,79,35,9,23,36,11,-2};
    int min = crr[0];
    for(int i=0;i<crr.length;i++){
        if(min>crr[i]){
            min=crr[i];
          }
    }
    System.out.println("The Minimum Element Present In The Array Is = "+min);

    //Question 8) Find Whether A Given Array Is sorted Or Not
        int[] sorted_arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] unsorted_arr = {11, 12, 34, 13, 9, 56, 32, 67};
        int flag2 = 0;
        for (int i = 1; i < sorted_arr.length; i++) {
            if (sorted_arr[i - 1] > sorted_arr[i]) {
                System.out.println("This Array Is Not Sorted");
                flag2 = -1;
                break;

            }
        }
        if (flag2 == 0) {
            System.out.println("Array Is Sorted");
        }
        System.out.println("Now Checking For Another Array");
        // This Code Is For Checking A Unsorted Array
        flag = 0;
        for (int i = 1; i < unsorted_arr.length; i++) {
            if (unsorted_arr[i - 1] > unsorted_arr[i]) {
                System.out.println("This Array Is Not Sorted");
                flag = -1;
                break;

            }
        }
        if (flag == 0) {
            System.out.println("Array Is Sorted");


        }
    }
}
