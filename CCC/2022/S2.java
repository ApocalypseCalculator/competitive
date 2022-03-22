import java.util.*;
import java.io.*;

public class S2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    static String nextLine() throws IOException {
        return in.readLine().trim();
    }

    public static void main(String[] args) throws IOException {
        int x = nextInt();
        HashMap<String, String> map1 = new HashMap<String, String>();
        for (int i = 0; i < x; i++) {
            String[] val = nextLine().split(" ");
            if (map1.containsKey(val[0])) {
                map1.put(val[0], map1.get(val[0]) + " " + val[1]);
            } else {
                map1.put(val[0], val[1]);
            }
            if (map1.containsKey(val[1])) {
                map1.put(val[1], map1.get(val[1]) + " " + val[0]);
            } else {
                map1.put(val[1], val[0]);
            }
        }
        int y = nextInt();
        HashMap<String, String> map2 = new HashMap<String, String>();
        for (int i = 0; i < y; i++) {
            String[] val = nextLine().split(" ");
            if (map2.containsKey(val[0])) {
                map2.put(val[0], map2.get(val[0]) + " " + val[1]);
            } else {
                map2.put(val[0], val[1]);
            }
            if (map2.containsKey(val[1])) {
                map2.put(val[1], map2.get(val[1]) + " " + val[0]);
            } else {
                map2.put(val[1], val[0]);
            }
        }
        int g = nextInt();
        int total = 0;
        for (int i = 0; i < g; i++) {
            String[] names = nextLine().split(" ");
            Set<String> nameset = new HashSet<>(Arrays.asList(names));
            for (int j = 0; j < 3; j++) {
                if (map1.containsKey(names[j])) {
                    String[] constraints = map1.get(names[j]).split(" ");
                    for (int k = 0; k < constraints.length; k++) {
                        if (!nameset.contains(constraints[k])) {
                            total++;
                        }
                    }
                }
                if (map2.containsKey(names[j])) {
                    String[] constraints = map2.get(names[j]).split(" ");
                    for (int k = 0; k < constraints.length; k++) {
                        if (nameset.contains(constraints[k])) {
                            total++;
                        }
                    }
                }
            }
        }
        System.out.println(total/2);
    }
}