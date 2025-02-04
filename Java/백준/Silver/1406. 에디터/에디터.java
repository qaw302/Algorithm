import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        LinkedList<String> list = new LinkedList();
        for (String s : br.readLine().split("")) {
            list.add(s);
        }
        
        ListIterator<String> iter = list.listIterator();
        while(iter.hasNext()) {
            iter.next();
        }
        
        int n = Integer.parseInt(br.readLine());
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if ("L".equals(command) && iter.hasPrevious()) {
                iter.previous();
            } else if ("D".equals(command) && iter.hasNext()) {
                iter.next();
            } else if ("B".equals(command) && iter.hasPrevious()) {
                iter.previous();
                iter.remove();
            } else if ("P".equals(command)) {
                iter.add(st.nextToken());
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        System.out.println(sb);
        br.close();
    }
}