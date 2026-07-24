class Solution {
    public boolean isPalindrome(String str) {
           str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}