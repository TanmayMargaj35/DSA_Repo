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

## P2. Find Second Largest [EASY] — Wipro/Accenture

### 📝 Problem
Find the second-largest distinct element in an array. If it doesn't exist, return `-1`.

### 📥 Input → 📤 Output
**Input:** `arr = [10, 5, 10, 8, 3]`  
**Output:** `8`

### 💻 Solution (Java)
public static void main(String[] args) {
    int a[] = {10, 5, 10, 8, 3};

    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < a.length; i++) {
        if (a[i] > max) {
            secondMax = max;
            max = a[i];
        } else if (a[i] < max && a[i] > secondMax) {
            secondMax = a[i];
        }
    }

    if (secondMax == Integer.MIN_VALUE) {
        System.out.println(-1);
    } else {
        System.out.println(secondMax);
    }
}

### Output
```text
8
```
