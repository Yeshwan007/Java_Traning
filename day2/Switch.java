public class Switch {
    public static void main(String[] args) {
        int a = 10;
        switch (a) {
            case 1:
                a++;
                System.out.println(a);
            case 2:
                ++a;
                System.out.println(a);
            case 3:
                --a;
            default:
                a--;
        }
        System.out.println(a);
    }

}
