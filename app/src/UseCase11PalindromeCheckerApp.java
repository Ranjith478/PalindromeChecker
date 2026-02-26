import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {
        input = input.toLowerCase().replaceAll("\\s+", "");
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class UseCase11PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = checker.checkPalindrome(input);
        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}