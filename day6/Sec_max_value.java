
public class Sec_max_value {
    public static void main(String[] args) {
        int a[] = { 4, 8, 6, 3, 1 };
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (first > a[i]) {
                second = first;
                first = a[i];
            } else if (second > a[i]) {
                second = a[i];
            }
        }
        System.out.println(second);
    }

}
