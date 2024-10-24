class Parent{
    public void parent_fun(){
        System.out.println("Hello I Am Parent Class Function");
    }

}
class child extends Parent{
    public void child_fun(){
        System.out.println("Hello I Am Child Class Function");
    }
}
public class Pro_1_Single_level_Inheritance {
    public static void main(String[] args) {
        System.out.println("Here We Are Going To Implement Single Level Inheritance");
        child c1 = new child();
        c1.parent_fun();
        c1.child_fun();
        System.out.println("This Is Dynamic Method Dispatch");
        Parent p1 = new child();
        p1.parent_fun();
        // This Will Lead To An Error (Because Child Can Have The Properties Of Parent But Parent Can Not Have The Properties Of Child) p1.child_fun();
    }
}
