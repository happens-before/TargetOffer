package com.xupt.edu.bishi.lianjia.mianshi;

/**
 * @author: zhaowanyue
 * @date: 2018/8/24
 * @description:
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order,
    not the kth distinct element.
    For example,
    Given [3,2,1,5,6,4] and k = 2, return 5.
    Note:
    You may assume k is always valid, 1 ≤ k ≤ array's length.
 */

/**
 * Quick Select的目标是找出第k大元素，所以
    若切分后的左子数组的长度 > k，则第k大元素必出现在左子数组中；
    若切分后的左子数组的长度 = k-1，则第k大元素为pivot；
    若上述两个条件均不满足，则第k大元素必出现在右子数组中。
 */
public class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, k, 0, nums.length -1);
    }

    // quick select to find the kth-largest element
    public int quickSelect(int[] arr, int k, int left, int right) {
        if (left == right)
            return arr[right];

        //patition方法还是用的 快排中的 partition
        int index = partition(arr, left, right);

        if (index - left+1 > k)
            return quickSelect(arr, k, left, index - 1);
        else if (index - left +1 == k)
            return arr[index];
        else
            return quickSelect(arr, k - index + left - 1, index + 1, right);

    }

    private int partition(int[] arr, int left, int right) {
        int i=left;
        int j=right;
        int pivotKey = arr[left];
       while(i<j)
       {
           while(i<j && arr[j]<pivotKey)
               j--;

           arr[left]=arr[j];
           while(i<j && arr[i]>pivotKey)
               i++;
           if(i<j)
           {
               arr[i]=arr[i]^arr[j];
               arr[j]=arr[i]^arr[j];
               arr[i]=arr[i]^arr[j];
           }
       }
       arr[i]=pivotKey;
       return i;
    }


    public static void main(String[] args) {
        int [] a={3,2,1,5,6,4};
        int result=new KthLargest().findKthLargest(a,3);
        System.out.println(result);
    }
}
