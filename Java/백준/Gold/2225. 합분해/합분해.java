import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (k==1) {
            System.out.println(1);
        } else {
            int[] dp = new int[n+1];
            dp[0] = 1;
            for (int i=0; i<k; i++) {
                for (int j=1; j<=n; j++) {
                    dp[j] = (dp[j-1] + dp[j]) % 1000000000;
                }
            }
            System.out.println(dp[n]);
        }
        br.close();
    }

}