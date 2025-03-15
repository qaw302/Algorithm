import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        if(n==0) System.out.println(0);
        else{
            while(n!=1){
                sb.append(Math.abs(n % -2));
                n = (int)Math.ceil((double)n/(-2));
            }
            sb.append(n);

            System.out.println(sb.reverse());
        }

    }
}