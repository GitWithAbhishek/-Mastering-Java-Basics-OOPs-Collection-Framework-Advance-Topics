class bike{
    static String Company;
    static String Model;
    static int cc;
    bike(){
        Company="Unknown";
        Model="Unknown";
        cc=0;
    }
    bike(String Company){
        this.Company=Company;
        Model="Unknown";
        cc=0;

    }
    bike(String Company,String Model){
        this.Company=Company;
        this.Model=Model;
        cc=0;

    }
    bike(String Company,String Model,int cc){
        this.Company=Company;
        this.Model=Model;
        this.cc=cc;

    }
    public static void show_details(){
        System.out.println("The Name Of Company Is "+Company+" The Model Name Is "+Model+" And It Is Of "+cc+" CC");
    }
}
public class Prg_2_Constructor_Overloading {
    public static void main(String[] args) {
        bike b1 = new bike();
        b1.show_details();
        bike b2 = new bike("Tvs");
        b2.show_details();
        bike b3 = new bike("Tvs","Apache");
        b3.show_details();
        bike b4 = new bike("Tvs","Apache",160);
        b4.show_details();

    }
}
