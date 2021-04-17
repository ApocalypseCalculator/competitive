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
        int m = nextInt();
        int n = nextInt();
        int k = nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = nextInt();
            }
        }
        int counter = 0;
        for(int i = 0; i < m-1; i++){ //triple nested loop go brrrrrrrrrrrrrrrrr
            for(int j = i+1; j < m; j++){
                for(int z = 0; z < n-1; z++){
                    if(arr[i][z] - arr[j][z] == arr[i][z+1]-arr[j][z+1] && Math.abs(arr[i][z+1]-arr[j][z+1]) == k){
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}

//This TLEs with 2/15