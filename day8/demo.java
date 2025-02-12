package day8;

public class demo {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        demo d= new demo();
        d.add(a,b);
        sub(a,b);
        
    }
    void add(int c,int d) {
        System.out.println(c+d);
    }
    static void sub(int e,int f) {
        System.out.println(e-f);
    }
    static void mul(int g,int h) {
        System.out.println(g*h);
        //we can use both methods
        System.out.println("multiplication " );
        return q*r;
    }
}
