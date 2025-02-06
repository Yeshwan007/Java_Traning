import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;
        while (div <= n / 2) {
            if (n / div == div) {
                System.out.println(div);   
        }

            div++;
        }

    }

}
