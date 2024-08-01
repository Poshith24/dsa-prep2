package com.posh;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,11};
//        int target=3;
//       int a= search(arr,target);
//        System.out.println(a);
        int e=arr.length-1;
        int pivot=findingPivot(arr);
            System.out.println(pivot+1);
    }

    static int search(int[] nums, int target) {
        int pivot=findingPivot(nums);
        if (pivot==-1){
            return(BinarySearch(nums,target,0,nums.length-1));
        }
        if (nums[pivot]==target){
            return pivot;
        }
        if (nums[0]<=target){
            return(BinarySearch(nums,target,0,pivot-1));
        }
        else
           return(BinarySearch(nums,target,pivot+1,nums.length-1));
    }

//    static void  Search(int[] nums,int target){
//        int pivot=findingPivot(nums);
//        if (pivot==-1){
//            //If there is no pivot just do normal Binary Search
//            System.out.println(BinarySearch(nums,target,0,nums.length-1));
//        }
//        if (nums[pivot]==target){
//            System.out.println(pivot);
//        }
//         if (nums[0]<target){
//            System.out.println(BinarySearch(nums,target,0,pivot-1));
//        }
//         else
//             System.out.println(BinarySearch(nums,target,pivot+1,nums.length-1));
//    }

    static int findingDuplicatePivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int mid=s+(e-s)/2;
            if (mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (mid <e && arr[mid]>arr[mid+1]){
                return mid;
            }

            if (arr[s]==arr[mid] && arr[mid]==arr[e]){
                //Checking whether start is pivot
                if (arr[s]>arr[s+1]){
                    return s;
                }
                s++;
                // checking whether end is pivot
                if (arr[e]<arr[e-1]){
                    return e-1;
                }
                e--;
            }

            else if (arr[s]<arr[mid] || (arr[s]==arr[mid] && arr[mid]>arr[e])){
                s=mid+1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr,int target,int s,int e){
        while(s<=e){
            int mid=s+(e-s)/2;

            if (arr[mid]>target){
                e=mid-1;
            }
            else if (arr[mid]<target){
                s=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }

    static int findingPivot(int[] arr){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int mid=s+(e-s)/2;
            if (mid>s && arr[mid]<arr[mid-1]){
                return mid-1;
            }
             if (mid <e && arr[mid]>arr[mid+1]){
                 return mid;
             }

             if (arr[s]>arr[mid]){
                 e=mid-1;
             }
             else
                 s=mid+1;
        }
        return -1;
    }

//    static int Pivot(int[] arr){
//
//        for (int i = 1; i < arr.length - 1; i++) {
//            if (arr[i]>arr[i+1] && arr[i]>arr[i-1]){
//                return i;
//            }
//        }
//        return -1;
//    }
}
