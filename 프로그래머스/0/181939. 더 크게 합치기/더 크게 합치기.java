class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int x = Integer.parseInt(a + "" + b);
        int y = Integer.parseInt(b + "" + a);
        
        if (x >= y) {
            return x;
        } else {
            return y;
        }
    }
}