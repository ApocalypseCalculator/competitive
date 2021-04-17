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
        String pitch = nextLine();
        graphpart[] arr = new graphpart[n];
        int depth = 0;
        int mindepth = Integer.MAX_VALUE;
        int maxdepth = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pitch.charAt(i) == '^') {
                arr[i] = new graphpart(depth, '/');
                depth -= 1;
            } else if (pitch.charAt(i) == 'v') {
                depth += 1;
                arr[i] = new graphpart(depth, '\\');
            } else {
                arr[i] = new graphpart(depth, '_');
            }
            if (depth > maxdepth) {
                maxdepth = depth;
            }
            if (depth < mindepth) {
                mindepth = depth;
            }
        }
        for (int i = mindepth; i <= maxdepth+1; i++) {
            String line = "";
            for (graphpart x : arr) {
                if (x.depth == i) {
                    line += x.part;
                } else {
                    line += '.';
                }
            }
            if (i == mindepth && !line.contains("/") && !line.contains("\\") && !line.contains("_")) {
            } 
            else if(i == maxdepth+1 && !line.contains("/") && !line.contains("\\") && !line.contains("_")){}
            else {
                System.out.println(line);
            }
        }
    }
}

class graphpart {

    int depth;
    char part;

    public graphpart(int d, char p) {
        this.depth = d;
        this.part = p;
    }
}

//This solution ACs