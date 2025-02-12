package tamilnadu.chennai;

public class office {
     final int salary = 45000;

     public office() {
          System.out.println("welcome to office");
     }

     public static void main(String[] args) {
          office off = new office();
          off.work();
          // off.salary = 50000;
          // Cannot assign a value to final variable 'salary'
     }

     public void work() {
          System.out.println("Working in the office with salary: " + salary);
     }

     public void wfh() {
          System.out.println("working in home");
     }

     public void recruit() {
          System.out.println("Recruiting new employees");
     }

}
