import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] s = new int[n];
        for (int i=0; i<n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n];
        dp[0] = s[0];
        for (int i=1; i<n; i++) {
            dp[i] = Math.max(dp[i-1] + s[i], s[i]);
        }

        Arrays.sort(dp);
        System.out.println(dp[n-1]);
        br.close();
    }
}