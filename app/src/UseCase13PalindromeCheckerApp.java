import java.util.*;

public class UseCase13PalindromeCheckerApp {

    static boolean reverseCheck(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }

    static boolean twoPointerCheck(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        long start, end;

        start = System.nanoTime();
        boolean r1 = reverseCheck(input);
        end = System.nanoTime();
        long time1 = end - start;

        start = System.nanoTime();
        boolean r2 = twoPointerCheck(input);
        end = System.nanoTime();
        long time2 = end - start;

        System.out.println("\nAlgorithm Performance:");
        System.out.println("Reverse Method Result: " + r1 + " | Time: " + time1 + " ns");
        System.out.println("Two Pointer Result   : " + r2 + " | Time: " + time2 + " ns");

        sc.close();
    }
}