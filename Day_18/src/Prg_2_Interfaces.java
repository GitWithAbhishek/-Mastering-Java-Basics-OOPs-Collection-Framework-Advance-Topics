interface Car {
    void Fuel_type();
    void Power_type();
    void Seater_type();
    void Look_type();
}
class Fortuner implements Car{
    public void Fuel_type(){
        System.out.println("Disel Type Car That Means More Efficiency");
    }

    @Override
    public void Seater_type() {
        System.out.println("Six Seater Car Best For Family");
    }

    @Override
    public void Look_type() {
        System.out.println("Full Mafia Look");
    }

    @Override
    public void Power_type() {
        System.out.println("4 X 4 Type Car Which Generate Max Power Under This Segment");
    }
}
public class Prg_2_Interfaces {

    public static void main(String[] args) {
        System.out.println("Here We Are Implementing Interface");
        Fortuner Aman_Fortuner = new Fortuner();
        System.out.println("Car Name is Fortuner");
        Aman_Fortuner.Fuel_type();
        Aman_Fortuner.Look_type();
        Aman_Fortuner.Seater_type();
        Aman_Fortuner.Power_type();

    }
}