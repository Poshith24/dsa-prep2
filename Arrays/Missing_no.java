package com.posh.Arrays;

class Missing_no {
    public int missingNumber(int[] arr) {
        
        int i =0;
        while(i<arr.length){
            int correct_pos = arr[i];
            if(arr[i]==arr.length){
                i++;
            }
            else if(i!=correct_pos){
                swap(arr,i,correct_pos);
            }
            else{
                i++;
            }
        }
        for(int j =0;j<arr.length;j++){
            if(j!=arr[j]){
                return j;
            }
        }
        return arr.length;
    }
    
    public void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}