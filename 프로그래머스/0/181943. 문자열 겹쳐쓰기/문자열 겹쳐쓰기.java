class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String front = my_string.substring(0, s);
        String middle = overwrite_string;
        String back = my_string.substring(s + overwrite_string.length());
        
        answer = front + middle + back;
        
        return answer;

        }
}