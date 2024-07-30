import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        int idx = 0;
        int cnt;
        while (idx < progresses.length) {
            for (int i=0; i<progresses.length; i++) {
                progresses[i]+=speeds[i];
            }
            cnt =0;
            while (idx < progresses.length && progresses[idx] >= 100) {
                cnt++;
                idx++;
            }
            if (cnt > 0) {
                list.add(cnt);
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}