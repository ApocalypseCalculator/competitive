import java.io.*;
import java.util.*;

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
    
    public static void main(String[] args)throws IOException{
        int n = nextInt();
        for(int i = 0; i < n; i++){
            String s = nextLine();
            if(s.contains("M") && s.contains("C")){
                System.out.println("NEGATIVE MARKS");
            }
            else if(s.contains("M") || s.contains("C")){
                System.out.println("FAIL");
            }
            else{
                System.out.println("PASS");
            }
        }
    }
}

//This solution ACs