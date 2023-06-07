/*
Given an integer matrix, find the length of the longest increasing path. From each cell, you can
either move to four directions: left, right, up or down. You may NOT move diagonally or move
outside of the boundary (i.e. wrap-around is not allowed).
Example 1:
Input: nums = 3 3
9 9 4
6 6 8
2 1 1
Output: 4
Explanation: The longest increasing path is [1, 2, 6, 9].
Example 2:
Input: nums =3 3
3 4 5
3 2 6
2 2 1
Output: 4
Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
*/
class Longest_Increasing_path_matrix{
  private int[] dx = new int[]{0,0,-1,1};
  private int[] dy = new int[]{1,-1,0,0};
  public int longestIncreasingPath(int[][] matrix){
    if(matrix == null||matrix.length==0){
      return 0;
    }
    int longest = 0;
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] dp = new int[m][n];
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        //performing dfs at each cell
        longest = Math.max(longest,dfs(i,j,matrix,dp));
      }
    }
    return longest;
  }
  private int dfs(int row,int col,int[][] matrix,int[][] dp){
    if(dp[row][col]>0){
      return dp[row][col];
    }
    int m = matrix.length;
    int n = matrix[0].length;
    int currentLongest = 0;
    for(int c=0;c<4;c++){
      //going through 4 dirs
      int i=row+dx[c];
      int j=col+dy[c];
      //if next cell is greater than the current index, update it
      if(i>=0 && i<m && j>=0 && j<n && matrix[row][col]<matrix[i][j]){
        currentLongest = Math.max(currentLongest,dfs(i,j,matrix,dp));
      }
    }
    //update dp matrix
    dp[row][col] = 1+currentLongest;
    return dp[row][col];
  }
      
      

