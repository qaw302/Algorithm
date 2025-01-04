import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Member[] members = new Member[n];
        for (int i=0; i<n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i] = new Member(
                Integer.parseInt(st.nextToken()),
                st.nextToken()
            );
        }

        Arrays.sort(members);

        StringBuilder sb = new StringBuilder();
        for (Member m : members) {
            sb.append(m.toString()).append('\n');
        }

        System.out.print(sb);
        br.close();
    }
}

class Member implements Comparable<Member> {
    public final String name;
    public final int age;
    
    public Member (int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Member o) {
        return age - o.age;
    }

    @Override
    public String toString() {
        return String.format("%d %s", age, name);
    }
}