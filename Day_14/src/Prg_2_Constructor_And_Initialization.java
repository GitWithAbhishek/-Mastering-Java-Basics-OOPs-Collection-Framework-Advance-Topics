class shape{
    // Attributes (fields)
    int length;
    int breadth;
    // Constructor to initialize the object
    shape(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to describe the shape
    void type_of_shape() {
        if(length==breadth){
            System.out.println("It's A Square ");
        }
        else {
            System.out.println("It's A Rectangle ");

        }
    }

    // Method to display shape details
    void displayDetails() {
        System.out.println("Length Of Shape: " + length+" m");
        System.out.println("Breadth Of Shape " + breadth + " m");
    }
}
public class Prg_2_Constructor_And_Initialization {
    public static void main(String[] args) {
        shape s1=new shape(12,23);
        shape s2=new shape(10,10);
        System.out.println("Talking About Shape s1");
        s1.type_of_shape();
        s1.displayDetails();
        System.out.println("Talking About Shape s2");
        s2.type_of_shape();
        s2.displayDetails();

    }
}
