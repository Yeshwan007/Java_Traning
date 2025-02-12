package tamilnadu.chennai;

public class Branchoffice extends office {
    public Branchoffice() {
        System.out.println("welcome to branch office");
    }

    public static void main(String[] args) {
        Branchoffice bff = new Branchoffice();
        bff.work();
       // bff.wfm();
        //bff.recuit();
        bff.celebrate();

    }

    public void celebrate() {
        System.out.println("celebrating function");
    }
}
