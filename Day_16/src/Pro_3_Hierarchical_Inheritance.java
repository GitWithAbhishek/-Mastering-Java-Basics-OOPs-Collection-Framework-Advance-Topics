class Polygons{
    public void Polygon_Fun(){
        System.out.println("I Am A Polygon Because I Have Sides");
    }
}
class Square extends Polygons{
    public void Square_Fun(){
        System.out.println("I Am A Square, All Sides Are Equal");
    }
}
class Rectangle extends Polygons{
    public void Rectangle_Fun(){
        System.out.println("I Am A Rectangle, Two Corresponding Sides Are Equal");
    }
}
class Rhombus extends Polygons{
    public void Rhombus_Fun(){
        System.out.println("I Am A Rhombus, All Sides Are Equal but Angles Are Not Right Angle");
    }
}
public class Pro_3_Hierarchical_Inheritance {
    public static void main(String[] args) {
        System.out.println("Here We Are Going To Implement  Hierarchical Inheritance");
        Square sq = new Square();
        sq.Square_Fun();
        sq.Polygon_Fun();
        Rectangle re = new Rectangle();
        re.Rectangle_Fun();
        re.Polygon_Fun();
        Rhombus rh = new Rhombus();
        rh.Rhombus_Fun();
        rh.Polygon_Fun();
    }
}
