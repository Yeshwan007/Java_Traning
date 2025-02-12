package tamilnadu.kerala;

import tamilnadu.chennai.office;

public class Branchoffice2 extends office {
    public Branchoffice2() {
        System.out.println("welcome to branch office2");
    }

    public static void main(String[] args) {
        Branchoffice2 bff2 = new Branchoffice2();
        bff2.work();
        // bff2.wfh();
        // bff2.recruit();
        bff2.celebrate();
    }

    public void celebrate() {
        System.out.println("celebrating function");
    }

    public void work()

    {
        System.out.println("Working in the branch office");
    }

}
