import java.util.*;
import java.io.*;
public class P1 {
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
        int n = nextInt();
        String s = nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[((int) s.charAt(i)) - 97]++;
        }
        int ct = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                ct++;
            }
        }
        System.out.println(Math.max(ct, 1));
    }
}