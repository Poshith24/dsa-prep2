package com.posh.leetcode_problems;

// https://leetcode.com/problems/median-of-two-sorted-arrays/
public class median_of_two_sorted_arrays {

    public static void main(String[] args) {
        System.out.println(median(new int[]{1,3},new int[]{2}));
    }

    static double median(int[] nums1,int[] nums2){
        int k=0;
        int s=0;
        int i =0;
        int[] nums = new int[nums1.length+nums2.length];

        while(s<nums1.length && k<nums2.length){
            if(nums1[s]<nums2[k]){
                nums[i] = nums1[s];
                s++;
            }
            else{
                nums[i] = nums2[k];
                k++;
            }
            i++;
        }
        if (s!=nums1.length){
            for (int j = s; j < nums1.length; j++) {
                nums[i] = nums1[j];
                i++;
            }
        }
        else if (k!=nums2.length){
            for (int j = k; j < nums2.length; j++) {
                nums[i] = nums2[j];
                i++;
            }
        }
        s =0;
        int e = nums.length;
        int m = s+(e-s)/2;
        if(e%2==0){
            int i1 = nums[m] + nums[m - 1];
            return  (double)i1/2;
        }

        return (double)nums[m];
    }

}
