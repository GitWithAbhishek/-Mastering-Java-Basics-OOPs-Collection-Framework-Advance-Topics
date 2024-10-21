class car{
    int launch_date;
    String Model;
    int cc;

    void show_details(){
        System.out.println("The Launch Date is "+launch_date+" Model Name "+Model+" of CC "+cc);
    }

    public void launch_date(int i) {
        this.launch_date=i;
    }
    public void Model(String i) {
        this.Model=i;
    }
    public void cc(int i) {
        this.cc=i;
    }
}
public class Prg_1_Class_And_Objects {
    public static void main(String[] args) {
        car Maruti = new car();
        Maruti.launch_date(12);
        Maruti.Model("SUV 700");
        Maruti.cc(100000);
        Maruti.show_details();
    }
}
