import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[n+1];
        for (int i=1; i<=n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        
        int[][] dp = new int[2][n+1];
        dp[1][n] = 1;

        for (int i=1; i<=n; i++) {
            dp[0][i]=1;
            dp[1][n-i]=1;
            for (int j=0; j<i; j++) {
                if (A[j] < A[i]) {
                    dp[0][i] = Math.max(dp[0][i], dp[0][j]+1);
                }
            }

            for (int j=n; j>n-i; j--) {
                 if (A[n-i] > A[j]) {
                     dp[1][n-i] = Math.max(dp[1][n-i], dp[1][j]+1);
                }
            }
        }

        int result = 0;
        for(int i=1; i<=n; i++) {
            result = Math.max(result, dp[0][i]+dp[1][i] -1);
        }

        
        System.out.println(result);
        br.close();
    }
}