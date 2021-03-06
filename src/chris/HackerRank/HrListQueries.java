package chris.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HrListQueries {
    public static void main(boolean file) {
        Scanner sc;
        sc = new Scanner(System.in);
        int size = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        while (size-- > 0) {
            lst.add(sc.nextInt());
        }

        int numQ = sc.nextInt();
        while (numQ-- > 0) {
            // trow away newline
            sc.nextLine();

            String cmd = sc.nextLine();
            switch (cmd) {
                case "Insert":
                    insertNextTwo(lst, sc);
                    break;
                case "Delete":
                    delete(lst, sc);
                    break;
            }
        }
        System.out.print(String.join(" ", lst.stream().map(i -> i.toString()).collect(Collectors.toList())));


    }

    private static void delete(List<Integer> lst, Scanner sc) {
        int idx = sc.nextInt();
        lst.remove(idx);
    }

    private static void insertNextTwo(List<Integer> lst, Scanner sc) {
        int idx = sc.nextInt();
        int elem = sc.nextInt();
        lst.add(idx, elem);
    }
}
