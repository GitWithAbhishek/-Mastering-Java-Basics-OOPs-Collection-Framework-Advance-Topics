class Grand_Parent{
    public void Grand_Parent_Fun(){
        System.out.println("Hello I Am Grand Parent");

    }
}
class Parents extends Grand_Parent{
    public void Parent_Fun(){
        System.out.println("Hello I Am Parent");

    }
}
class Child extends Parents{
    public void Child_Fun(){
        System.out.println("Hello I Am Child");

    }
}
public class Pro_2_Multilevel_Inheritance {
    public static void main(String[] args) {
        System.out.println("Here We Implement MultiLevel Inheritance");
        Child C = new Child();
        C.Child_Fun();
        C.Parent_Fun();
        C.Grand_Parent_Fun();

    }
}
