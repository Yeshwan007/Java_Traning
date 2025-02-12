public class LenOfLastWord {
    public static void main(String[] args) {
        String s = "  i love you ";
        s = s.trim();
        int len = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                continue;
            } else {
                System.out.println(len - (i + 1));
                break;
            }
        }

    }

}
