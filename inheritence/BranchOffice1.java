package tamilnadu.trichy;

import tamilnadu.chennai.Branchoffice;

public class BranchOffice1 extends Branchoffice {
    public BranchOffice1() {
        System.out.println("welcome to branchOffice1");
    }

    public static void main(String[] args) {
        BranchOffice1 bff1 = new BranchOffice1();
        bff1.celebrate();
    }

    void hike() {
        System.out.println("got hike");
    }
}
