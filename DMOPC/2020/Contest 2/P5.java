import java.io.*;
import java.util.*;

public class P3 {

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

    public static int total = 0;

    public static void main(String[] args) throws IOException {
        int n = nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }
        checkSubarrays(arr, 0, 0);
        System.out.println(total);
    }

    public static boolean hasMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(arr.length == 1) return true;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int count = map.get(arr[i]) + 1;
                if ((double) count > arr.length / 2.0) {
                    return true;
                } else {
                    map.put(arr[i], count);
                }

            } else {
                map.put(arr[i], 1);
            }
        }
        return false;
    }

    public static void checkSubarrays(int[] arr, int start, int end) {  
        if (end == arr.length) {
            return;
        } 
        else if (start > end) {
            checkSubarrays(arr, 0, end + 1);
        }
        else {
            int[] nextarr = new int[end-start + 1];
            for (int i = start; i < end; i++) {
                nextarr[i-start] = arr[i];
            }
            nextarr[end-start] = arr[end];
            if(hasMajority(nextarr)) total++;
            checkSubarrays(arr, start + 1, end);
        }
        return;
    }
}

//This solution TLEs with 5/100