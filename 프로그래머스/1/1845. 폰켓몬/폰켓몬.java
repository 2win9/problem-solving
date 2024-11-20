import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int selection = nums.length / 2; // 뽑는 수
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int num : nums){
            hs.add(num);
        }
        
        int size = hs.size();
        
        
        // 결과 저장
        if(selection < size){
            answer = selection;
        }else{
            answer = size;
        }
        
        
        
        
        return answer;
    }
}

//