class vehicle{
    public void vehicle_fun(){
        System.out.println("It Is Used To Make Transport Easy");
    }
}
class Fuel_vehicle extends vehicle{
    public void Fuel_vehicle_fun(){
        System.out.println("It Uses Petrol or Deisel To Run The Vehicle");
    }
}
class Electric_vehicle extends vehicle{
    public void Electric_vehicle_fun(){
        System.out.println("It Uses Electricity To Run The Vehicle");
    }
}
class Hybrid_vehicle extends Fuel_vehicle{
    public void Hybrid_vehicle_fun(){
        System.out.println("It Uses Both Fuel And Electricity To Run The Vehicle");
    }
}
public class Pro_5_Hybrid_Inheritance {
    public static void main(String[] args) {
        Hybrid_vehicle hv = new Hybrid_vehicle();
        hv.Fuel_vehicle_fun();
        hv.Hybrid_vehicle_fun();

    }
}
