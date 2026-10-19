// class Pen{
//     String colour;
//     String type;
//     public void write(){
//         System.out.println("writing something");
//     }
// public void printColour(){
//     System.out.println(this.colour);
// }
//}
// public class oop1{
//     public static void main(String[] args){
//         Pen pen1=new Pen();
//         pen1.colour="blue";
//         pen1.type="gel";
//         Pen pen2=new Pen();
//         pen2.colour="black";
//         pen2.type="ball";
//         pen1.printColour();
//         pen2.printColour();
//     }
// }


// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(){
//         System.out.println("constructor called"); //it is call by Student s1 only single object
//     }
// }public class oop1{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="vishesh";
//         s1.age=20;
//         s1.printInfo();
//     }
// }

// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(String name,int age){
//          this.name=name;
//          this.age=age;
//     }
// }public class oop1{
//     public static void main(String[] args) {
//         Student s1=new Student("vishesh",20);
//         s1.printInfo();
//     }
// }

// class Student{
//     String name;
//     int age;
//     public void printInfo(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//     }
//     Student(Student s2){
//         this.name=s2.name;
//         this.age=s2.age;
//     }
//     Student(){}
// }public class oop1{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="vishesh";
//         s1.age=20;
//         Student s2=new Student(s1);
//         s2.printInfo();
//     }
// }

//polymorphism
// class Student{
//     String name;
//     int age;
//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(String namr,int age){
//         System.out.println(name+" "+age);
//     }
// }public class oop1{
//     public static void main(String[] args) {
//         Student s1=new Student();
//         s1.name="vishesh";
//         s1.age=20;
//         s1.printInfo(s1.name,s1.age);
//     }
// }

// //inheritance
// class shape{
//     public void area(){
//         System.out.println("display area");
//     }
// }

// //single level inheritance
// class Triangle extends shape{
//     public void area(int l,int h){
//         System.out.println(0.5*l*h);
//     }
// }

// //multilevel inheritance
// // class equilateralTriangle extends Triangle{
// //     public void area(int l,int h){
// //         System.out.println(0.5*l*h);
// //     }
// // }

// //hierarchical inheritance
// class Circle extends shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
// }
// public class oop1{
//     public static void main(String[] args) {
       
//     }
// }



//encapsulation:-data+methods



// //abstraction
// abstract class Animal{
//     // public void walk(){
//     // }  
//     abstract public void walk(); //abstract method 
//     Animal(){ //base class constructor 1st called then derived class constructor called
//         System.out.println("animal constructor called");
//     }
//     public void eat(){
//         System.out.println("eats food");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("horse constructor called");
//     }
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
// }
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walks on 2 legs");
//     }
// }
// public class oop1{
//     public static void main(String[] args) {
//        Horse horse=new Horse();
//        horse.walk();
//        //Animal animal=new Animal(){  //cannot create object of abstract class
//         //animal.walk();
//        //}
//        horse.eat();

//     }
// }



// //interface
// interface Animal{
//     int eyes=2; //by default public static final
//      void walk();
//      //Animal(){} //interface cannot have constructor
//      //void eat(){} //interface cannot have method body with non-abstract method
// }
// interface Herbivore{
//     void eatGrass();
// }
// class Horse implements Animal, Herbivore{
//     public void walk(){
//         System.out.println("walks on 4 legs");
//     }
//     public void eatGrass(){
//         System.out.println("eats grass");
//     }
// }
// public class oop1{
//     public static void main(String[] args) {
//         // Animal animal=new Animal(); //cannot create object of interface
//         Horse horse=new Horse();
//         horse.walk();
//         System.out.println(horse.eyes); //accessing the default public static final variable
//     }
// }


//static keyword
class Student{
    String name;
    int age;
    static String school; //static variable

    public static void changeSchool(){ //static method
        school="XYZ School";
    }
}
public class oop1{
    public static void main(String[] args) {
        Student.school="ABC School"; //accessing static variable without creating object
        Student s1=new Student();
        s1.name="Alice";
        s1.age=20;
        System.out.println(s1.name+" "+s1.age+" "+s1.school);
    }
}
        