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

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int m = nextInt();
        int[] first = new int[1000001];
        Arrays.setAll(first, i -> -1);
        int[] last = new int[1000001];
        Arrays.setAll(last, i -> -1);
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            if(first[x] == -1){
                first[x] = i;
            }
            last[x] = i;
        }
        int max = 0;
        for(int i = 0; i < m; i++){
            int x1 = nextInt();
            int x2 = nextInt();
            if(first[x1] != -1 && first[x2] != -1){
                int bleh = last[x2] - first[x1] + 1;
                if(bleh > max) max = bleh;
            }
        }
        System.out.println(max);
    }
}

//This solution ACs