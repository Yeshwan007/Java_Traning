public class IfelseIf {
    public static void main(String[] args) {
        int a = 12, b = 21, c = 32;
        if (a > b && a > c) {
            System.out.println(a + " greater");
        } else if (b > a && b > c) {
            System.out.println(b + " greater");
        } else {
            System.out.println(c + " greater");
        }
    }
}
