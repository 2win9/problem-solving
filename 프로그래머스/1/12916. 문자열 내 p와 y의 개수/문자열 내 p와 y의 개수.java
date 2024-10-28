class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCount = 0;
        int yCount = 0;
        
        int len = s.length();
        for(int i=0; i<len; i++){
            if(s.charAt(i)=='A'+15||s.charAt(i)=='a'+15){
                pCount++;
            }
            else if(s.charAt(i) == 'A'+24||s.charAt(i)=='a'+24){
                yCount++;
            }
            else{
                continue;
            }
        }
        
        if(pCount == yCount)
            answer = true;
        else
            answer = false;

        return answer;
    }
}