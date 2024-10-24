import java.io.*;
import java.lang.*;
import java.util.*;

interface One {
    public void One_Fun();
}

interface Two {
    public void Two_Fun();
}

interface Three extends One, Two {
    public void Three_Fun();
}
class Child_2 implements Three {
    @Override public void One_Fun()
    {
        System.out.println("I Am The Function Of One Interface");
    }

    public void Two_Fun() {
        System.out.println("I Am The Function Of Two Interface");
    }
    public void Three_Fun(){
        System.out.println("I Am The Function Of Three Interface");

    }

}
public class Pro_4_Multiple_Inheritance {
    public static void main(String[] args)
    {
        Child_2 c = new Child_2();
        c.One_Fun();
        c.Two_Fun();
        c.Three_Fun();
    }
}
