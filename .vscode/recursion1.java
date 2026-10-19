//1 tower of hanoi
// public class recursion1{
//     public static void towerOfHanoi(int n,String src,String helper,String dest){
//         if(n==1){
//           System.out.println("transfer disk " +n+ " from " +src+ " to " +dest);
//           return;  
//         }
//         towerOfHanoi(n-1,src,dest,helper);
//         System.out.println("transfer disk " +n+ " from " +src+ " to " +dest);
//         towerOfHanoi(n-1,helper,src,dest);

//     }
//     public static void main(String[] args){
//         int n=4;
//         towerOfHanoi(n,"s","h","d");
//     }
// }

//print a string in reverse order
// public class recursion1{
//     public static void printReverse(String str,int idx){
//         if(idx==0){
//             System.out.print(str.charAt(0));
//             return;
//         }
//         System.out.print(str.charAt(idx));
//         printReverse(str,idx-1);

//     }
//     public static void main(String[] args) {
//         String str="abcd";
//         printReverse(str,str.length()-1);

//     }
// }

//find the 1st and last occurance of an element in string
// public class recursion1{
//     public static int first=-1;
//     public static int last=-1;
//     public static void findOccurance(String str,int idx,char element) {
//         if (idx==str.length()) {
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         char currentChar=str.charAt(idx);
//         if(currentChar == element){
//             if(first==-1){
//                 first=idx;
//             }
//             else{
//                 last=idx;
//             }
//         }
//         findOccurance(str,idx+1,element);
//     }
//     public static void main(String[] args) {
//         String str="abaacdaefaah";
//         findOccurance(str,0,'a');
//     }
// }

//to check if array is sorted or not
// public class recursion1{
//     public static boolean isSorted(int arr[],int idx){
//         if(idx==arr.length-1){
//             return true;
//         }
//         if (arr[idx]>=arr[idx+1]){
//             return false;
//         }
//         else{
//             return isSorted(arr,idx+1);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5};
//         System.out.println(isSorted(arr,0));
//     }
// }

//move all x to the end of string
// public class recursion1{
//     public static void xLast(String str,int idx,int count,String newStr){
//         if(idx==str.length()){
//             for(int i=1;i<=count;i++){
//                 newStr +='x';
//             }
//             System.out.println(newStr);
//             return;
//         }
//         char currentChar=str.charAt(idx);
//         if(currentChar=='x'){
//             count++;
//           xLast(str,idx+1,count,newStr);
//         }
//         else{
//             newStr+=currentChar;
//             xLast(str,idx+1,count,newStr);
//         }
//     }
//     public static void main(String[] args){
//         String str="axbcxxd";
//        xLast(str,0,0,"");
//    }
//}

//remove duplicates from string
//public class recursion1 {
//     public static void removeDplct(String str, int idx, String newStr) {
//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         char currentChar = str.charAt(idx);
//         boolean alreadyPresent = false;

//         for (int i = 0; i < newStr.length(); i++) {
//             if (newStr.charAt(i) == currentChar) {
//                 alreadyPresent = true;
//                 break;
//             }
//         }
//         if (!alreadyPresent) {
//             newStr += currentChar;
//         }
//         removeDplct(str, idx + 1, newStr);
//     }

//     public static void main(String[] args) {
//         String str = "abbccda";
//         removeDplct(str, 0, "");
//     }
// }

//to remove duplicates from string using boolean array
// public class recursion1 {
//     public static boolean[] map = new boolean[26];
//     public static void removeDplct(String str, int idx, String newStr) {
//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         char currentChar = str.charAt(idx);
//         if (map[currentChar - 'a']) {
//             removeDplct(str, idx + 1, newStr);
//         } else {
//             newStr += currentChar;
//             map[currentChar - 'a'] = true;
//             removeDplct(str, idx + 1, newStr);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "abebccdaeedff";
//         removeDplct(str, 0, "");
//     }
// }

//to print all subsequences of a string
// public class recursion1 {
//     public static void printSubsequences(String str, int idx, String newStr) {
//         if (idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }
//         char currentChar = str.charAt(idx);
//         // to be
//         printSubsequences(str, idx + 1, newStr + currentChar);
//         // not to be
//         printSubsequences(str, idx + 1, newStr);
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         printSubsequences(str, 0, "");
//     }
// }

//to print all unique subsequences of a string
// import java.util.HashSet;
// public class recursion1 {
//     public static void printSubsequences(String str, int idx, String newStr, HashSet<String> set) {
//         if (idx == str.length()){
//             if (set.contains(newStr)) {
//                 return;
//             } else {
//                 System.out.println(newStr);
//                 set.add(newStr);
//                 return;
//             }
//         }
//         char currentChar = str.charAt(idx);
//         // to be
//         printSubsequences(str, idx + 1, newStr + currentChar,set);
//         // not to be
//         printSubsequences(str, idx + 1, newStr,set);
//     }

//     public static void main(String[] args) {
//         String str = "aaa";
//         HashSet<String> set = new HashSet<>();
//         printSubsequences(str, 0, "",set);
//     }
// }

//to print keypad combinations
// public class recursion1 {
//     public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//     public static void printCombination(String str,int idx,String combination){
//         if(idx==str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currentChar=str.charAt(idx);
//         String mapping=keypad[currentChar-'0'];
//         for(int i=0;i<mapping.length();i++){
//             printCombination(str,idx+1,combination+mapping.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String str="23";
//         printCombination(str,0,"");
//     }
// }




//*********** */
//print permutation of abc
// public class recursion1{
//     public static void printPermutation(String permutation,String str) {
//         if(str.length()==0){
//             System.out.println(permutation);
//             return;
//         }
//         for(int i=0;i<str.length();i++){
//             char currentChar=str.charAt(i);
//             String newStr=str.substring(0,i)+str.substring(i+1);
//             printPermutation(permutation+currentChar,newStr);
//         }
//     }
//     public static void main(String[] args) {
//         String str="abc";
//         printPermutation("",str);
//     }
// }

//count of path to achive n,m
// public class recursion1{
//     public static int countPaths(int i,int j,int n,int m){
//          if(i==n  || j==m){
//             return 0;
//         }
//         if(i==n-1  && j==m-1){
//             return 1;
//         }
//         int downPaths=countPaths(i+1,j,n,m);  //downward
//         int rightPaths=countPaths(i,j+1,n,m); //rightward
//         return downPaths+rightPaths;
//     }
//     public static void main(String[] args) {
//         int n=3,m=3;
//         int paths=countPaths(0,0,n,m);
//         System.out.println(paths);
//     }
// }

//number of tiles on a floor 
// public class recursion1{
//     public static int wayTiles(int n,int m){
//         if(n==m){
//             return 2;
//         }
//         if(n<m){
//             return 1;
//         }
//         int vertical=wayTiles(n-m,m);
//         int horizontal=wayTiles(n-1,m);
//         return vertical+horizontal;
//     }
//     public static void main(String[] args) {
//         int n=4,m=2;
//         int ways=wayTiles(n,m);
//         System.out.println(ways);
//     }
// }

//ways to invite n guest
// public class recursion1{
//     public static int wayInvite(int n){
//         if(n<=1){
//             return 1;
//         }
//         int ways1=wayInvite(n-1);
//         int ways2=wayInvite(n-2)*(n-1);
//         return ways1+ways2;
//     }
//     public static void main(String[] args){
//         int n=4;
//         System.out.println(wayInvite(n));
//     }
//}

//print all the subset of set n

import java.util.ArrayList;

public class recursion1{
    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }
        subset.add(n);  //add hoga integer
        findSubset(n-1,subset);
        subset.remove(subset.size()-1);  //add nahi hoga integer
        findSubset(n-1,subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findSubset(n,subset);
    }
}