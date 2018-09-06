package com.xupt.edu.bishi.leecode;

/**
 * @author: zhaowanyue
 * @date: 2018/9/6
 * @description:当前的数组是一个经过排序之后的循环有序数组，但是该数组的主元选择并不一定是下标为i=0的第一个元素。
    例如有序数组为：{1，2，3，4，5，6}
    其循环有序数组可能为： {3，4，5，6，1，2}、 {6，1，2，3，4，5}、{4，5，6，1，2，3}等
    输入: nums = [4,5,6,7,0,1,2], target = 0
    输出: 4
 */
public class Search {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[start] <= nums[mid]){
                if (target < nums[mid] && target >= nums[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] array={4,5,6,7,0,1,2};
        int result=new Search().search(array,0);
        System.out.println(result);
    }
}
