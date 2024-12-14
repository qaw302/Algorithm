import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n % 2 != 0) {
            System.out.println(0);
        } else {
            int[] dp = new int[n+1];
            dp[0] = 1;
            dp[2] = 3;
            for (int i=4; i<=n; i++) {
                dp[i] = dp[i-2] * dp[2];
                for (int j=4; j<=i; j+=2) {
                    dp[i] += dp[i-j] * 2;
                }
                
            }
    
            System.out.println(dp[n]);
        }
        br.close();
    }
}