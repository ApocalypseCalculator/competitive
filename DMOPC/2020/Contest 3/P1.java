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

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        HashSet<Integer> kek = new HashSet<Integer>();
        for(int i = 0; i < n; i++){
            if(!kek.add(nextInt())){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}