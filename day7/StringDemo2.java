public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = "ABC";
        System.out.println(s3.compareTo(s4));
        // return 0 if both strings are equal
        // return positive value if the s1>s2
        // return negative value if s1<s2

        String s5 = "silence please don't talk";
        System.out.println(s5.startsWith("silence"));
        System.out.println(s5.endsWith("talk"));
        System.out.println(s5.contains("s5"));

        String s6 = "hello";
        System.out.println(s1.equals("abc"));
        System.out.println(s6.contains("o"));
    }

}
