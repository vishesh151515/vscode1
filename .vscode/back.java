// //print permutation of abc
// public class back {
//     public static void printPermutation(String str, String permutation, int idx) {
//         if (str.length() == 0) {
//             System.out.println(permutation);
//             return;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char current = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i + 1);
//             printPermutation(newStr, permutation + current, idx + 1);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "ABC";
//         printPermutation(str, "", 0);
//     }
// }

//N-Queens

// //print permutation of abc
// public class back {
//     public static void printPermutation(String str, String permutation, int idx) {
//         if (str.length() == 0) {
//             System.out.println(permutation);
//             return;
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char current = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i + 1);
//             printPermutation(newStr, permutation + current, idx + 1);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "ABC";
//         printPermutation(str, "", 0);
//     }
// }

//N-Queens

// import java.util.ArrayList;
// import java.util.List;

// public class back {
//     public boolean isSafe(int row,int col,char[][] board){
//         //horizontal
//         for(int j=0;j<board.length;j++){
//             if(board[row][j]=='Q'){
//                 return false;
//             }
//         }
//         //vertical
//         for(int j=0;j<board.length;j++){
//             if(board[j][col]=='Q'){
//                 return false;
//             }
//         }
//         //upper left
//         int r=row;
//         for(int c=col;c>=0 && r>=0;c--,r--){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         //upper right
//         r=row;
//         for(int c=col;c<board.length && r>=0;c++,r--){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         //lower left
//         r=row;
//         for(int c=col;c>=0 && r<board.length;c--,r++){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         //lower right
//         r=row;
//         for(int c=col;c<board.length && r<board.length;c++,r++){
//             if(board[r][c]=='Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void saveBoard(char[][] board,List<List<String>>allBoards){
//         String row ="";
//         List<String> newBoard =new ArrayList<>();
//         for(int i=0;i<board.length;i++){
//             row="";
//             for(int j=0;j<board[0].length;j++){
//                 if(board[i][j]=='Q'){
//                     row+='Q';
//                 }
//                 else{
//                     row+='.';
//                 }
//             }
//             newBoard.add(row);
//         }
//         allBoards.add(newBoard);
//     }
//     public void helper(char [][] board,List<List<String>>allBoards,int col){
//         if(col==board.length){
//             saveBoard(board,allBoards);
//             return;
//         }        
//         for(int row=0;row<board.length;row++){
//             if(isSafe(row,col,board)){
//                 board[row][col]='Q';
//                 helper(board,allBoards,col+1);
//                 board[row][col]='.';
//             }
//         }
//     }
//     public List<List<String>>solveNQueens(int n){
//         List<List<String>>allBoards=new ArrayList<>();
//         char[][] board=new char[n][n];
//         helper(board,allBoards,0);
//         return allBoards;
//     }

//     public static void main(String[] args) {
//         back obj = new back();
//         List<List<String>> solutions = obj.solveNQueens(4);
//         for (List<String> board : solutions) {
//             System.out.println(board);
//         }
//     }
// }

//print permutation of num integer

// import java.util.Arrays;
// public class back{
//     public static void printPerm(int[] num,int[] newNum){
//         if(num.length==0){
//             System.out.println(Arrays.toString(newNum));
//             return;
//         }
//         for(int i=0;i<num.length;i++){
//             int n=num[i];
//             int[] remain=new int[num.length-1];
//             int k=0;
//             for(int j=0;j<num.length;j++){
//                 if(j!=i){
//                     remain[k++]=num[j];
//                 }
//             }
//             int[] nextPerm=new int[newNum.length+1];
//             System.arraycopy(newNum,0,nextPerm,0,newNum.length);
//             nextPerm[nextPerm.length-1]=n;
//             printPerm(remain,nextPerm);
//         }
//     }
//     public static void main(String[] args){
//         int[] num={12,2,3};
//         printPerm(num,new int[0]);
//     }
// }

// public class back {
    
//     // Pure recursive backtracking function
//     public static void printPerm(int[] num, int idx) {
//         // BASE CASE: If the index reaches the end, a full permutation is formed
//         if (idx == num.length) {
//             // Print the array elements side-by-side as a single sequence
//             for (int i = 0; i < num.length; i++) {
//                 System.out.print(num[i]);
//             }
//             System.out.println(); // Move to the next line
//             return;
//         }

//         // Loop through all available choices from the current index to the end
//         for (int i = idx; i < num.length; i++) {
            
//             // 1. CHOOSE: Swap the element at 'idx' with the element at 'i'
//             int temp1 = num[idx];
//             num[idx] = num[i];
//             num[i] = temp1;

//             // 2. EXPLORE: Move to the next index position via recursion
//             printPerm(num, idx + 1);

//             // 3. UNCHOOSE (Backtrack): Swap back to restore the original array state
//             int temp2 = num[idx];
//             num[idx] = num[i];
//             num[i] = temp2;
//         }
//     }

//     public static void main(String[] args) {
//         int[] num = {7, 2, 3,9};
        
//         // Start the recursion from the 0-th index
//         printPerm(num, 0);
//     }
// }



//knight movement in chess?