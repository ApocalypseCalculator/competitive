import java.util.*;
import java.io.*;

public class S3 {
    static BufferedOutputStream out = new BufferedOutputStream(System.out);
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static String next() throws IOException {
        while (st== null || !st.hasMoreTokens() ) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }
    static long nextLong() throws IOException {
        return Long.parseLong(next() );
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        int n = nextInt(), m = nextInt();
        long k = nextLong();
        if(k > (n+1L)*n/2 || k < n) { 
            System.out.println(-1); 
        }
        else {
            long[] arr = new long[n];
            long x = -1;
            for (long i = (n < m) ? n : m; i >= 1; i--) {
                long val = (n - i) + i * (i + 1) / 2;
                if (val <= k) {
                    x = i;
                    break;
                }
            }
            arr[0] = 1;
            for(int i = 1; i < n; i++) {
                arr[i] = arr[i-1]+1;
                if(arr[i] > x) {
                    arr[i] = 1;
                }
            }
            long curMax = x*(x+1)/2 + (n-x)*x;
            int rptr = arr.length - 1;
            if(curMax < k) {
                System.out.println(-1);
                return;
            }
            for(int i = n-1; i >= x-1; i--) {
                if(i == 0) break;
                long travel = (arr[i-1] > arr[i]) ? arr[i-1] - arr[i] : arr[i-1] + x - arr[i];
                if(curMax - k >= travel) {
                    curMax -= travel;
                }
                else {
                    if(curMax - k <= x - arr[i]) {
                        arr[i]+=(curMax - k);
                    }
                    else {
                        arr[i]+=(curMax - k - x);
                    }
                    rptr = i;
                    break;
                }
            }
            long matchVal = arr[rptr];
            for(int i = rptr; i < n; i++) {
                arr[i] = matchVal;
            }
            printArr(arr);
        }
    }

    public static void printArr(long[] arr) throws IOException {
        StringBuilder total = new StringBuilder(); //spid
        //bufferedoutputstream > system.out.print significantly, especially when our string can be about 10^7 characters long
        for(int i = 0; i < arr.length-1; i++) {
            total.append(arr[i]).append(" ");
        }
        total.append(arr[arr.length-1]).append("\n");
        out.write(total.toString().getBytes());
        out.flush();
    }
}