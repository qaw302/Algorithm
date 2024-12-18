import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] p = new int[n+1];
        for (int i=1; i<=n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[n+1];
        for (int i=1; i<=n; i++) {
            dp[i] = p[i];
            
            for (int j=1; j<=i/2; j++) {
                dp[i] = Math.max(dp[i], dp[j] + dp[i-j]);
            
            }
        }
        
        System.out.println(dp[n]);
        br.close();
    }
}