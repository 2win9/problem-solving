class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int xCount = 0;
        int dCount = 0;
        
        char x = s.charAt(0);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == x)
                xCount ++;
            else
                dCount ++;
            
            if(xCount == dCount){
                answer ++;
                xCount = 0;
                dCount = 0;

                if(i+1 < s.length()){
                    x = s.charAt(i+1);
                }
            }
        }    
        
        if(xCount != 0){
            answer ++;
        }
        
        
        return answer;
    }
}