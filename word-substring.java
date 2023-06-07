/*
Write a JAVA Program to return all index pairs [i,j] given a text string and
words (a list), so that the substring text[i]…text[j] is in the list of words
Given a text string and words (a list of strings), return all index pairs [i, j] so that the substring
text[i]...text[j] is in the list of words.
Note:
 All strings contains only lowercase English letters.
 It's guaranteed that all strings in words are different.
 Return the pairs [i,j] in sorted order (i.e. sort them by their first coordinate in case of ties
sort them by their second coordinate).
Example 1:
Input: text = "thestoryofleetcodeandme", words = ["story","fleet","leetcode"]
Output: [[3,7],[9,13],[10,17]]
Example 2:
Input: text = "ababa", words = ["aba","ab"]
Output: [[0,1],[0,2],[2,3],[2,4]]
Explanation:
Notice that matches can overlap, see "aba" is found in [0,2] and [2,4]
*/
class Solution{
  public int[][] indexPairs(String text,String[] words){
    List<int[]> indexPairsList = new ArrayList<int[]>();
    //adding words to the list
    for(String word:words){
      int wordLength = word.length();
      int curIndex = 0;
      while(curIndex >= 0){
        curIndex = text.indexOf(word,curIndex);
        if(curIndex >=0){
          indexParisList.add(new int[]{curIndex,curIndex+wordLength-1});
          curIndex++;
        }
      }
    }
    //sorting the words indeces
    Collections.sort(indexPairsList,new Comparator<int[]>(){
      public int compare(int[] array1,int[] array2){
        return ((array1[0]!=array2[0])?(array1[0]-array2[0]):(array1[1]-array2[1]));
      }
    });
    //inserting indeces into the pairs list
    int length = indexPairsList.size();
    int[][] indexPairs = new int[length][2];
    for(int i=0;i<length;i++){
      int[] indexPair = indexPairsList.get(i);
      indexPairs[i][0] = indexPair[0];
      indexPairs[i][1] = indexPair[1];
    }
    return indexPairs;
  }
}
          
      





