public class PalindromeTest {
    public static void main(String[] args) {
        String txt = "level";
        String msg = isPalindrome(txt) ? txt + " is palindrome": txt + " is not palindrome";
        System.out.println(msg);

    }
    private static boolean isPalindrome(String txt){
        StringBuilder sb = new StringBuilder(txt);
        String reverse = sb.reverse().toString();
        return reverse.equals(txt);
    }
}
