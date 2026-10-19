// import java.util.ArrayList;
// import java.util.Collections;

// public class AL {
//     public static void main(String[] args) {
//         // Integer | Float | Double | String | Character | Boolean | Long | Short | Byte
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> list1 = new ArrayList<>();

//         //to add elements to the list
//         list.add(0);
//         list.add(1);
//         System.out.println("List: " + list);

//         //to get elements from the list
//         int element = list.get(0);
//         System.out.println("Element at index 0: " + element);

//         //to add elements at a specific index
//         list.add(1, 2);
//         System.out.println("List after adding element at index 1: " + list);

//         //to set elements at a specific index
//         list.set(0, 3);
//         System.out.println("List after setting element at index 0: " + list);

//         //to remove elements from the list
//         list.remove(2);
//         System.out.println("List after removing element at index 2: " + list);

//         //to get the size of the list
//         int size = list.size();
//         System.out.println("Size of the list: " + size);

//         //to iterate through the list
//         for (int i = 0; i < list.size(); i++) {
//             System.out.print(list.get(i)+" ");
//         }
//         System.out.println();
       
//         //to sort the list
//         Collections.sort(list);
//         System.out.println("List after sorting: " + list);

//          //to check if the list is empty
//         boolean isEmpty = list.isEmpty();
//         System.out.println("Is the list empty? " + isEmpty);

//         //to clear the list
//         list.clear();
//         System.out.println("List after clearing: " + list);
//     }
// }





// import java.util.*;

// class AL{
//     public static void main(String[] args){

//         Scanner sc=new Scanner(System.in);
//         ArrayList<Integer> number=new ArrayList<>();
//         System.out.print("enter the number of number that you want to print:-");
//         int size=sc.nextInt();
//         int numbers[]=new int[size];
//         System.out.println("enter the number:-");
//         for(int i=0;i<size;i++){
//             int k=sc.nextInt();
//             number.add(i,k);
//             numbers[i]=k;
//         }

//         System.out.println(numbers);
//         Collections.sort(number);
//         System.out.println(number.get(size-1));
//         System.out.println(number.get(0));
//         boolean isAscending=true;
//         for(int i=0;i<size;i++){
//             int s=number.get(i);
//             int us=numbers[i];
//             if(s!=us){
//               isAscending=false;
//             }
//         }
//             if(isAscending){
//                 System.out.println("sorted");
//             }
//             else{
//                 System.out.println("not sorted");
//             }

        // Scanner sc=new Scanner(System.in);
        // ArrayList<String> name=new ArrayList<String>();
        // System.out.print("enter the the number of name that you wanna print:-");
        // int size=sc.nextInt();
        // System.out.println("enter the name:-");
        // for(int i=0;i<size;i++){
        //     String k=sc.next();
        //     name.add(i,k);
        // }
        // System.out.println(name);

//     }
// }

import java.util.*;
class AL{
    public static void main(String[] args){
        ArrayList<String> word=new ArrayList<>();
        ArrayList<Integer> num=new ArrayList<>();
        word.add("a");word.add("b");
        num.add(1);num.add(2);
        for(int i=0;i<word.size();i++){
            String k=word.get(i);
            int m=num.get(i);
            System.out.print("'"+k+"'"+":"+m+", ");
        }
    }
}




