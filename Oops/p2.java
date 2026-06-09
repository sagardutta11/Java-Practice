package Oops;
import java.util.*;
public class p2 {
    public static class Car{
        String name;
        int cc;
        String type;

        void print(){
            System.out.println(name+" "+cc+" "+type);
        }

    }
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "Ninja";
        c1.type = "sedan";
        c1.cc = 1200;
        c1.print();

    }
}
