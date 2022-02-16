import java.util.Scanner;

public class SharlockHomes {
    public static boolean isSubstring(String s1, String s2) {
        int[] arr = new int[52];
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            int x = Integer.valueOf(c);
            if (x >= 65 && x <= 90) {
                arr[x - 65]++;
            } else {
                arr[x - 97 + 26]++;
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            int x = Integer.valueOf(c);
            if (x >= 65 && x <= 90) {
                arr[x - 65]--;
                if (arr[x - 65] < 0)
                    return false;
            } else {
                arr[x - 97 + 26]--;
                if (arr[x - 97 + 26] < 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            t--;
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if (isSubstring(s1, s2)) {
                System.out.println("YES");
            } else {
                System.err.println("NO");
            }
        }
        sc.close();
    }
}
