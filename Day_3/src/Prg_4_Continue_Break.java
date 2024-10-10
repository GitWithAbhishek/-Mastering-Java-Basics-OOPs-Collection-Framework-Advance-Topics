public class Prg_4_Continue_Break {
    public static void main(String[] args) {
        System.out.println("We Are Going To Use Continue And Break In BTW");
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                System.out.println("Here Continue Is Encountered At "+i);
                continue;
            }
            if(i==9){
                System.out.println("Here Break Is Encountered At "+i);
                break;
            }
            System.out.println("Hello India");
        }
    }
}