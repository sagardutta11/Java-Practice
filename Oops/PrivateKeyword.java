package Oops;

class Students{
    String name; //default null
    private int rno = 115; //0
    double cgpa; //0.0

    void print(){ //getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getRno(){ //getter
        return rno;
    }
    void setRno(int x){ //setter , these are mainly used for integers
        rno = x;
    }

//    public void p(){
//        print();
//    }
}
public class PrivateKeyword {
    public static void main(String[] args) {
    Students s1 = new Students();
    s1.cgpa =9.0;
    s1.name ="abc";
    //s1.roll = 45; //cant use roll as its private
        System.out.println(s1.getRno());
    s1.setRno(116);
    s1.print();
    }
}
//getter and setter is used for private properties