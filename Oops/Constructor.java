package Oops;

public class Constructor {
    public static class Car {
        int seats;
        String name;
        double length;
        Car(){ //default constructor

        }
        Car(int x, String s, double d){
            seats = x;
            name = s;
            length = d;

        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car(5,"kia Sonet",3.99);
        c1.print();
        Car c2 = new Car();
        c2.name = "Lord Alto";
        c2.print();

    }
}
