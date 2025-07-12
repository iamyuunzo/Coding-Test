class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";
        
        for (int i=0; i<num_list.length; i++) {
            int n = num_list[i];
            
            if (n % 2 == 0) {
                evenStr += n;
            } else {
                oddStr += n;
            }
        }
        int oddNum = Integer.parseInt(oddStr);
        int evenNum = Integer.parseInt(evenStr);
        
        return oddNum + evenNum;
    }
}