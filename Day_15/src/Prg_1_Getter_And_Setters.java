class Secret_Agency{
    private int id;
    private String Name;


    void setId(int i){
        this.id=i;
    }
    void getId(){
        System.out.println("The Id Number Is "+id);
    }
    void setName(String Name){
        this.Name=Name;
    }
    void getName(){
        System.out.println("Name Of The Agent Is "+Name);
    }

}
public class Prg_1_Getter_And_Setters {
    public static void main(String[] args) {
        System.out.println("When We Use Private Access Modifiers Then To Use Getter And Setter To Initialize Their Values");
        Secret_Agency s1=new Secret_Agency();
        s1.setId(004);
        s1.getId();
        s1.setName("Aman Pandey");
        s1.getName();

    }
}
