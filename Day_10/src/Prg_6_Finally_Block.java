public class Prg_6_Finally_Block {
    public static void main(String[] args) {
        System.out.println("Implementing Finally Block");
        int a=4;
        for(int i=3;i>=0;i--){
            try{
                System.out.println((a/i));
            }
            catch(Exception e){
                System.out.println("This Is Exception "+e);
                break;
            }
            finally {
                System.out.println("This Is Finally Block Execute Everytime");
            }
        }
    }
}
