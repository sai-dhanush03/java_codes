package practice;

import java.util.Stack;

import java.util.Stack;

import java.util.Stack;

public class three {
    public static void main(String[] args) {
        int nums[] = {5, 3, 2, 4, 1};
        int target = 5;
        Stack<Integer> s = new Stack<>();
        util(nums, target, 0, s);
    }

    public static void util(int nums[], int target, int i, Stack<Integer> s) {
        if (target == 0) {
            System.out.println(s);
            return;
        }

        if (i < nums.length) {
            // Not selected
            util(nums, target, i + 1, s);

            // Selected
            if (target - nums[i] >= 0) {
                s.push(nums[i]);
                util(nums, target - nums[i], i + 1, s);
                s.pop();
            }
        }
    }
}
