package Array;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr ={2,3,6,7,9};
        for (int ele : arr)
            System.out.print(ele+" ");
        //for each loop sirf print karwane me kaam lagta hai, mtlb ele me kuch
        //change kare to main array as it is rahega, kyuki for each loop sirf print karane me help karta hai
        //idhar ele ek copy banata hai array k ek ek element ka, naki pure array ka ekbaar me
    }
}
