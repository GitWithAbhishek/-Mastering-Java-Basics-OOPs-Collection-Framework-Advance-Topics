class parent_poly{
    public void fun(){
        System.out.println("Before Overriding");
    }
}
class child_poly extends parent_poly{
    @Override
    public void fun(){
        System.out.println("After Overriding");
    }
}
public class Prg_2_Runtime_polymorphism {
    public static void main(String[] args) {
        System.out.println("The Code Is for Method Overriding");
        parent_poly pr_obj = new parent_poly();
        child_poly ch_obj = new child_poly();
        pr_obj.fun();
        ch_obj.fun();



    }
}
