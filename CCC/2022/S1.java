import java.util.*;
import java.io.*;

public class S1 {
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
        int b = (int) Math.floor(n/5.0);
        int amt = -1;
        for(int i = b; i >= 0; i--) {
            if((n - i*5) % 4 == 0) {
                amt = (n - i*5) / 4;
                b = i;
                break;
            }
        }
        if(amt == -1) {
            System.out.println(0);
        }
        else {
            System.out.println(1 + (int)Math.floor(b/4.0));
        }
    }
}