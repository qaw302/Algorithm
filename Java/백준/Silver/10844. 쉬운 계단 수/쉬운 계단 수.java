import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n+1][10];

        for (int i=1; i<dp[1].length; i++) {
            dp[1][i] = 1;
        }
        
        for (int i=2; i<=n; i++) {
            dp[i][0] = dp[i-1][1];
            dp[i][9] = dp[i-1][8];
            for (int j=1; j<9; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % 1000000000;
            }
        }

        long sum = 0;
        for (int i=0; i<=9; i++) {
            sum += dp[n][i];
        }
        

        System.out.println(sum%1000000000);
        br.close();
        
    }
}