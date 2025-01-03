package competitiveCoding;

import java.util.*;

public class HalloumiBoxes {
    public static boolean solve(List<Integer> a, int k) {
        int n = a.size();
        if (k == 1) {
            List<Integer> copy = new ArrayList<>(a);
            Collections.sort(copy);
            for (int i = 0; i < n; i++) {
                if (!copy.get(i).equals(a.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int zz = 0; zz < t; zz++) {
            int n = sc.nextInt(); // Number of boxes
            int k = sc.nextInt(); // Maximum length of subarray to reverse
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            if (solve(a, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}
