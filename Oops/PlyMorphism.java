package Oops;

public class PlyMorphism {
 public static class Dog{
     void speak(){
         System.out.println("Bhau Bhau");
     }
 }
 public static class Cat{
     void speak(){
         System.out.println("Meow Meowww");
     }
 }
 public static class Lion{
     void speak(){
         System.out.println("Grrra Grrrr");
     }
 }

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();
        d.speak();
        c.speak();
        l.speak();
    }



}
