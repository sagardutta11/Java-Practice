package Oops;
import java.util.Arrays;
public class Marks {
    public static class Studentdata{
        String name;
        int rno;
        int[] marks;
        Studentdata(int[] s){
            marks = Arrays.copyOf(s,s.length);
        }
        Studentdata(int s){
             marks = new int[s];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,9,8};
        Studentdata s1 = new Studentdata(arr);
        s1.marks[0]= 1;
        System.out.println(arr[0]);//deep copy, arr is alag than marks
        s1.marks[1]= 2;
        System.out.println(s1.marks[0]);
    }
}
