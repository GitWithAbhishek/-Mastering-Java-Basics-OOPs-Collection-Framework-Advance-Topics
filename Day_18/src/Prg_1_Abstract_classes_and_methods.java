abstract class Animal{
    abstract void Behaviour();
    abstract void Eat_type();
    abstract void Life_Span();
    public void make_sound(){
        System.out.println("Yup Buddy It's Me");
    }
}
class species extends Animal{
    @Override
    void Behaviour() {
        System.out.println("Wild Or Friendly");
    }

    @Override
    void Eat_type() {
        System.out.println("Carnivorous Omnivorous Herbivorous");
    }

    @Override
    void Life_Span() {
        System.out.println("Avg Life Span Is 30 yrs");
    }
}
public class Prg_1_Abstract_classes_and_methods {
    public static void main(String[] args) {
        System.out.println("Here we implement Abstract Method And class");
        species Lion = new species();
        Lion.Behaviour();
        Lion.Eat_type();
        Lion.Life_Span();
        Lion.make_sound();

    }
}
