package practice;

import java.util.*;

public class target_sum {

    public static int find(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void targetsum(int arr[], int target, int k) {

        if (k == arr.length) {
            return;
        }
        int sum = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = k; i < arr.length; i++) {

            sum = sum + arr[i];
            if (sum < target) {
                s.push(arr[i]);
                int rem = target - sum;
                find(arr, rem);
                if (find(arr, rem) == -1) {
                    continue;
                } else {
                    s.push(arr[find(arr, rem)]);
                    // printstack(s);
                    System.out.println(s);

                    s.pop();
                }
            } else if (sum > target) {
                while (!s.isEmpty()) {
                    s.pop();
                }
                targetsum(arr, target, k + 1);

            } else if (sum == target) {
                s.push(arr[i]);
                System.out.println(s);
                continue;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5,3,2,4,1 };
        int target = 5;
        // 2,3,3,3,6,7
        Arrays.sort(arr);
        targetsum(arr, target, 0);

    }
}
