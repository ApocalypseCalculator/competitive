import java.util.*;
import java.io.*;

public class P3 {

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

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        path[] roombas = new path[n];
        for (int i = 0; i < n; i++) {
            roombas[i] = new path(nextInt(), nextInt());
        }
        Arrays.sort(roombas);
        int ct = 0;
        for (int i = 0; i < m; i++) {
            int x = nextInt();
            int y = nextInt();
            for(int j = 0; j < roombas.length; j++){
                path a = roombas[j];
                if (a.x >= x && a.y <= y) {
                    ct++;
                }
                else if(a.x < x) break;
            }
        }
        System.out.println(ct);
    }

    static class path implements Comparable<path> {

        int x, y;

        public path(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(path i) {
            return i.x - x;
        }
    }
}

//This solution TLEs with 15/100