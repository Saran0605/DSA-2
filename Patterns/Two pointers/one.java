//344. Reverse String
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while(left<right){
         char temp = s[right];
         s[right] = s[left];
         s[left] = temp;
         left++;
         right--;
        }
        
    }
}