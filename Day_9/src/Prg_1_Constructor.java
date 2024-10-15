class car {
    static String model;
    static int cc;

    //Default Constructor
    car() {
        model = "unknown";
        cc = 0;
    }

    //Parametrised Constructor
    car(String model, int cc) {
        this.model = model;
        this.cc = cc;

    }

    public static void display_car_details() {
        System.out.println("I Model Of Car Is " + model + " The CC is " + cc);
    }
}
public class Prg_1_Constructor {
    public static void main(String[] args) {
        car c1 = new car();
        c1.display_car_details();
        car c2 = new car("Fortuner",1000);
        c2.display_car_details();

    }
}
