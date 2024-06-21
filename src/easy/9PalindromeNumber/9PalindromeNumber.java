class Solution {
    public boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        int size = a.length();


        for(int i = 0; i < size/2; i++){
            if(a.charAt(i) != a.charAt(size -i-1)){
                return false;
            }
        }
        return true;
    }
}