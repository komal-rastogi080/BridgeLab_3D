package Java_core.JavaMethods.Level3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q8 {
    public static int generateOTP(){
        return (int)(Math.random()*900000) + 100000; // 100000..999999
    }
    public static int[] generateMany(int count){
        int[] a=new int[count];
        for(int i=0;i<count;i++) a[i]=generateOTP();
        return a;
    }
    public static boolean allUnique(int[] a){
        Set<Integer> s=new HashSet<>();
        for(int x:a) s.add(x);
        return s.size()==a.length;
    }

    public static void main(String[] args){
        int[] otps = generateMany(10);
        System.out.println("OTPs: " + Arrays.toString(otps));
        System.out.println("All unique? " + allUnique(otps));
    }
}
