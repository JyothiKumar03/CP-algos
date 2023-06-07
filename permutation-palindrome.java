/*
Write a JAVA Program to check whether the permutation of a string forms
a palindrome
Given a string s, return true if a permutation of the string could form a palindrome.
Example 1:
Input: s = "code"
Output: false
Example 2:
Input: s = "aab"
Output: true
Example 3:
Input: s = "carerac"
Output: true
*/
class PermutationPal{
  public boolean canPermutePal(Stirng s){
    Integer bitMask = 0;
    for(int i=0;i<s.length();i++){
      bitMask^=1<<(s.charAt(i)-'a'+1);
    }
    return Integer.bitCount(bitMask)<=1;
  }
}
