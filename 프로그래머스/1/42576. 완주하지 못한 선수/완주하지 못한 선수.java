import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // 1. 해시맵을 만든다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
        {
            map.put(player, map.getOrDefault(player, 0) + 1);
        }
        
        // 2. 해시맵을 뺀다
        for(String player : completion)
        {
            map.put(player, map.get(player) - 1);
        }
        
        // 3. value 가 0이 아닌 원소를 찾는다.
        for(String key : map.keySet())
        {
            if(map.get(key) != 0)
                answer = key;
        }
        
        return answer;
    }
}