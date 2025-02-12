package day8;

public class school {
    static String name = "ABC School";
    int fees;
    public static void main(String[] args) {
        school adimissin=new school();
        System.out.println(name);
        adimissin.fees=12000;
        System.out.println(adimissin.fees);
    }
    void teaching() {
        System.out.println("Teacher is teaching");
    }
    
}
