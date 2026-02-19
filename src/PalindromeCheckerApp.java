public class PalindromeCheckerApp {
    public static void main(String args[]) {
        System.out.println("Jai Shree ram , Welcome to Palindrome Checker Management app\n" +
                "Version : 1.0" + "\nSysytem initialized successfully");
        String str = "Water";
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // Pressing Enter here should now work perfectly
                System.out.println("Not a palindrome");return;
            }
        }
    }
}