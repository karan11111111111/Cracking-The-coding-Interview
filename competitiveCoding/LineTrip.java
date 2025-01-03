package competitiveCoding;

import java.util.*;

public class LineTrip {
    public static int solve(List<Integer> a, int x) {
        int n = a.size();
        int maxDistBetweenGasStations = Math.max(a.get(0) - 0, 2 * (x - a.get(n - 1)));
        for (int i = 1; i < n; i++) {
            maxDistBetweenGasStations = Math.max(maxDistBetweenGasStations, a.get(i) - a.get(i - 1));
        }
        return maxDistBetweenGasStations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        for (int zz = 0; zz < t; zz++) {
            int n = sc.nextInt(); // Number of gas stations
            int x = sc.nextInt(); // Length of the road
            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }
            int res = solve(a, x);
            System.out.println(res);
        }

        sc.close();
    }
}



