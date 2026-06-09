package Oops;

import java.util.Scanner;
public class p1 {
    public static class Student{
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Sagar";
        s1.cgpa = 8.36;
        s1.rno = 2328115;

        Student s2 = new Student();
        s2.name = "Yash";
        s2.cgpa = 9.9;
        s2.rno = 2328058;
        Student s3 = new Student();
        System.out.print("Enter name:");
        s3.name = sc.nextLine();
        System.out.print("Enter roll:");
        s3.rno = sc.nextInt();
        System.out.print("Enter cgpa:");
        s3.cgpa = sc.nextDouble();

        System.out.println(s2.name + s2.rno + s2.cgpa);
        System.out.println(s3.name + s3.rno + s3.cgpa);

    }
}
