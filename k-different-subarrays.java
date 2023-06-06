/*
Write a JAVA Program to find Subarrays with K Different integers
Given an array A of positive integers, call a (contiguous, not necessarily distinct) subarray of A
good if the number of different integers in that subarray is exactly K. (For example, [1,2,3,1,2]
has 3 different integers: 1, 2, and 3.)
Return the number of good subarrays of A.
Example 1:
Input: A = [1,2,1,2,3], K = 2
Output: 7
Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1],
[2,1,2], [1,2,1,2]
Example 2:
Input: A = [1,2,1,3,4], K = 3
Output: 3
Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
*/

import java.util.*;
class SOlution{
  public int KdistinctSubArrays(int[] A,int k){
    return atMost(A,k)-atMost(A,k-1);
  }
  private  int atMost(int[] A,int k){
    int i=0,res=0;
    Map<Integer,Integer> count = new HashMap<>();
    for(int j=0;j<A.length;j++){
      if(count.getOrDefault(A[j],0)==0){
        k--;
      }
      count.put(A[j],count.getOrDefault(A[j],0)+1);
      while(k<0){
        count.put(A[i],count.get(A[i]-1);
        if(count.get(A[i])==0)k++;
        i++;
      }
      res += j-i+1;
    }
  }
}
                  
                  
                  
   
        
        
        
