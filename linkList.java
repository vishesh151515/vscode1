// public class linkList {
//     Node head;//head of the linked list
//     private int size;//size of the linked list

//     linkList(){//constructor to initialize the linked list
//         this.head = null;//set the head to null
//         this.size = 0;//set the size to 0
//     }

//     class Node{//inner class to represent a node in the linked list
//         String data;//data stored in the node
//         Node next;//pointer to the next node in the list
//         Node(String data){//constructor to initialize the node with data
//             this.data = data;//set the data of the node
//             this.next = null;//set the next pointer to null
//             size++;//increment the size of the linked list
//         }
//     }
//     //add node at the first of the list
//     public void addFirst(String data){//method to add a new node at the beginning of the list
//         Node newNode = new Node(data);//create a new node with the given data
//         if(head == null){//check if the list is empty
//             head = newNode;//if the list is empty, make the new node the head
//             return;
//         }
//         newNode.next = head;//link the new node to the previous head
//         head = newNode;//update the head to the new node
//     }


//     //add node at the end of the list
//     public void addLast(String data){//method to add a new node at the end of the list
//         Node newNode = new Node(data);//create a new node with the given data
//         if(head == null){//check if the list is empty
//             head = newNode;//if the list is empty, make the new node the head
//             return;
//         }
//         Node current = head;//start from the head of the list
//         while(current.next != null){//traverse to the end of the list using current pointer
//             current = current.next;//move to the next node
//         }
//         current.next = newNode;//link the last node to the new node
//     }


//     //print the elements of the list
//     public void printList(){//method to print the elements of the list
//         if(head == null){//check if the list is empty
//             System.out.println("List is empty");//print a message if the list is empty
//             return;
//         }
//         Node current = head;//start from the head of the list
//         while(current != null){//traverse the list until the end
//             System.out.print(current.data + " ->");//print the data of the current node
//             current = current.next;//move to the next node
//         }
//         System.out.println("Null");//print a newline character
//     }


//     //delete a node from first of the list
//     public void deleteFirst(){//method to delete the first node of the list
//      size--;//decrement the size of the linked list
//         if(head == null){//check if the list is empty
//             System.out.println("List is empty");//print a message if the list is empty
//             return;
//         }
//         head = head.next;//update the head to the second node causing the first node to be removed from the list
//     }

//     //delete a node from last of the list
//     public void deleteLast(){//method to delete the last node of the list
//         if(head == null){//check if the list is empty
//             System.out.println("List is empty");//print a message if the list is empty
//             return;
//         }
//         size--;//decrement the size of the linked list
//         if(head.next == null){//check if there is only one node in the list
//             head = null;//if there is only one node, set the head to null
//             return;
//         }
//         Node secondLast = head;//start from the head of the list
//         Node lastNode = head.next;//initialize the last node to the second node of the list
//         while(lastNode.next != null){//traverse to the last node of the list
//             secondLast = secondLast.next;//move the secondLast pointer to the next node
//             lastNode = lastNode.next;//move the lastNode pointer to the next node
//         }
//         secondLast.next = null;//unlink the last node from the list by setting the next pointer of the second last node to null
//     }

//     public int getSize(){//method to get the size of the linked list
//         return size;//return the size of the linked list
//     }


//     public static void main(String[] args) {
//         linkList list = new linkList();//create a new linked list
//         list.addFirst("is");//add a node at the beginning of the list
//         list.addFirst("This");//add another node at the beginning of the list
//         list.addLast("a");//add a node at the end of the list
//         list.addLast("linkedLIst");//add another node at the end of the list
//         list.printList();//print the elements of the list
//         list.deleteFirst();//delete the first node of the list
//         list.printList();//print the elements of the list after deletion
//         list.deleteLast();//delete the last node of the list
//         list.printList();//print the elements of the list after deletion
//         System.out.println("Size of the list: " + list.getSize());//print the size of the linked list
//     }
// }








// import java.util.*;
// class linkList{
//     public static void main(String[] args) {
//     LinkedList<String> list = new LinkedList<String>();//create a new linked list
//        list.add("is");//add a node at the beginning of the list
//         list.addFirst("This");//add another node at the beginning of the list
//         list.addLast("a");//add a node at the end of the list
//         //(if we only use add() method, it will add the element at the end of the list)
//         list.addLast("linkedLIst");//add another node at the end of the list
//         System.out.println(list);//print the elements of the list
//         //(if we only use remove() method, it will remove the first element of the list)
//         list.removeFirst();//delete the first node of the list
//         System.out.println(list);//print the elements of the list after deletion)
//         list.removeLast();//delete the last node of the list
//         System.out.println(list);//print the elements of the list after deletion
//         System.out.println("Size of the list: " + list.size());//print the size of the linked list

//         for(int i=0;i<list.size();i++){//traverse the list using for loop
//             if(list.get(i) == "a"){//check if the element is present at which index
//                 System.out.print(i + " -> ");//print the index if the element is null
//                 continue;
//             }
//             System.out.print(list.get(i) + " ->");//print the elements of the list using get() method
//         }
//         System.out.println("null");
//     }
// }


// import java.util.*;
// class linkList{
//     public static void main(String[] args) {
//         LinkedList<Integer> num=new LinkedList<>();
//         num.add(1);  num.add(5);  num.add(7);  num.add(3);  num.add(8);  num.add(2);  num.add(3);
//         for(int i=0;i<num.size();i++){
//             System.out.print(num.get(i)+"->");
//         }
//         System.out.println("null");
//         for(int i=0;i<num.size();i++){
//             if(num.get(i)==7){
//                 System.out.print(i);
//             }
//         }
//     }
// }

// import java.util.*;
// class linkList{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         LinkedList<Integer> num=new LinkedList<>();
//         System.out.print("how many number you wannna add:-");
//         int n=sc.nextInt();
//         System.out.print("Enter the number:-");
//         for(int i=0;i<n;i++){
//             int k=sc.nextInt();
//             if(k>0 && k<50){
//             num.add(k);
//             }else{
//                 System.out.println("value should be between 0 to 50");
//                 i--;
//             }
//         }
//         System.out.println(num);
//         for(int j=0;j<num.size();j++){
//            int y =num.get(j);
//            if(y>25){
//             num.remove(j);
//             j--;
//            }
//         }
//         System.out.println(num);
//     }
// }