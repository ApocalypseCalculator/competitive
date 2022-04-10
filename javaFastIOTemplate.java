import java.util.*;
import java.io.*;

public class javaFastIOTemplate {

    static BufferedOutputStream out = new BufferedOutputStream(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String nextLine() throws IOException {
        return in.readLine().trim();
    }
    
    static void print(String result) throws IOException {
        out.write(result.getBytes());
        out.flush();
        return;
    }

    public static void main(String[] args) throws IOException {
        //code goes here
    }
}
