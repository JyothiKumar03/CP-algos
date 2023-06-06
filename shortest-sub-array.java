/*
Write a JAVA Program to find shortest sub array with sum at least K
Return the length of the shortest, non-empty, contiguous subarray of A with sum at least K. If
there is no non-empty subarray with sum at least K, return -1.
Example 1:
Input: A = [1], K = 1
Output: 1
Example 2:
Input: A = [1,2], K = 4
Output: -1
Example 3:
Input: A = [2,-1,2], K = 3
Output: 3
Note:
1 <= A.length <= 50000
-10 ^ 5 <= A[i] <= 10 ^ 5
1 <= K <= 10 ^ 9
*/

public int shortestSubArray(int[] A,int k){
  int N = A.length;
  long[] p = new long[N+1];
  for(int i=0;i<N;i++){
    P[i+1] = P[i]+(long)A[i];
    int ans = N+1;
    Dequeue<Integer> q = new LinkedList();
    for(int y=0;y<p.length;y++){
      while(!q.isEmpty() && p[y] <= p[q.getLast()]){
        q.removeLast();
      }
      while(!q.isEmpty() && p[y] >= p[q.getFirst]+k){
        ans = Math.min(ans,y-q.removeFirst());
      }
      q.addLast(y);
    }
    return ans<N+1 ? ans:-1;   
 }
    
    
    
