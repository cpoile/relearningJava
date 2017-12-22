package chris.ch1a;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HrBigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        Arrays.sort(s, (s1, s2) -> {
            if (s1 == null || s2 == null) return 0;
            return -1 * new BigDecimal(s1).compareTo(new BigDecimal(s2));
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
