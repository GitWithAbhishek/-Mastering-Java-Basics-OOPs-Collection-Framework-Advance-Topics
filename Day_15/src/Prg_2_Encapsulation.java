class Student{
    class School_Student{
        int Roll_no;
        String Name;
        void School_Student(int i,String name){
            this.Roll_no=i;
            this.Name=name;
        }

        void show_student_details(){
            System.out.println("Student Roll No "+Roll_no+" And Name Of The Student Is "+Name);
        }
    }
    class Student_Banking_Details{
        private int acc_no;
        private int balance;

        void setAcc_no(int i){
            this.acc_no=i;
        }
        void setBalance(int i){
            this.balance=i;
        }
        void getAcc_no(){
            System.out.println("Account number is "+acc_no);
        }
        void getBalance(){
            System.out.println("The Balance is "+balance);
        }
    }
}

public class Prg_2_Encapsulation{
    public static void main(String[] args) {
        System.out.println("This Code Is For Encapsulation");
        Student s1 = new Student();
        //This method is to access the inner class using the outer class
        Student.School_Student ss1=s1.new School_Student();
        Student.Student_Banking_Details ss2=s1.new Student_Banking_Details();
        ss1.School_Student(002,"Naman");
        ss1.show_student_details();
        ss2.setAcc_no(5200);
        ss2.setBalance(1200);
        ss2.getAcc_no();
        ss2.getBalance();

    }
}