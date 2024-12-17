import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static final int MOD = 1000000;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();

        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;
        if (input.startsWith("0")) {
            dp[len] = 0;
        } else {
            for (int i=2; i<=len; i++) {
                int pre = input.charAt(i-2)-'0';
                int cur = input.charAt(i-1)-'0';

                if (cur == 0) {
                    if (pre == 1 || pre == 2) {
                        dp[i] = dp[i-2];
                    }
                } else if (pre == 1 || (pre == 2 && cur <= 6)) {
                    dp[i] = (dp[i-1] + dp[i-2]) % MOD;
                } else {
                    dp[i] = dp[i-1];
                }
            }
        }
        
        System.out.println(dp[len]);
        br.close();
    }
}