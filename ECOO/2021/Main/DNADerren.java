import java.util.*;
import java.io.*;
public class P2 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }
    static String nextLine() throws IOException {
        return in.readLine().trim();
    }
    public static void main(String[] args) throws IOException {
        String s = nextLine();
        System.out.print(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == 'A' && s.charAt(i-1) == 'A'){
                System.out.print(" ");
            }
            else if(s.charAt(i) != 'A' && s.charAt(i-1) != 'A'){
                System.out.print(" ");
            }
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}