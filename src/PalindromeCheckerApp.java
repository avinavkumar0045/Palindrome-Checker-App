public class PalindromeCheckerApp {
    public static void main(String args[]) {
        System.out.println("Jai Shree Ram, Welcome to Palindrome Checker Management app\n" +
                "Version : 1.0" + "\nSystem initialized successfully\n");

        String str = "Water";
        // To make it case-insensitive (optional but recommended), use:
        // String temp = str.toLowerCase();

        int n = str.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                isPalindrome = false;
                break; // Stop checking once a mismatch is found
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is NOT a palindrome.");
        }
    }
}