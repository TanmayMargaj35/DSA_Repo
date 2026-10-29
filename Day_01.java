//P1. Find Maximum Element Given an array of integers, find and return the largest element.Input:   arr = [3, 1, 7, 2, 9, 4] Output: 9 
import java.util.*;

public class Array_1 {
    public static void main(String[] args) {
        int a[] = {3,1,7,2,9,4};

        int max = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
