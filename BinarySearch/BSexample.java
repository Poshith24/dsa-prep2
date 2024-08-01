package com.posh.BinarySearch;
import java.util.Arrays;
public class BSexample {
    public static void main(String[] args) {
        int mat[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 6;
        int ans[] = search(mat,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] binarySearch(int mat[][],int target,int row,int cStart,int cEnd)
    {
        while(cStart<=cEnd)
        {
            int mid = cStart + (cEnd - cStart) / 2;
            if(mat[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            if(mat[row][mid] > target)
            {
                cEnd = mid - 1;
            }
            else
            {
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int mat[][],int target)
    {
        int rows = mat.length;
        int cols = mat[0].length;
        if(rows==1)
        {
            return binarySearch(mat,target,0,0,mat[0].length-1);
        }
        //column search to reduce the rows
        int rStart = 0;
        int rEnd = mat.length-1;
        int cMid = cols/2;
        while(rStart<(rEnd-1))
        {
            int mid = rStart + (rEnd-rStart)/2;
            if(mat[mid][cMid]==target)
            {
                return new int[]{mid,cMid};
            }
            if(mat[mid][cMid]>target)
            {
                rEnd = mid-1;
            }
            else
            {
                rStart = mid;
            }
        }
        //we have two rows now
        if(mat[rStart][cMid]==target)
        {
            return new int[]{rStart,cMid};
        }
        if(mat[rStart+1][cMid]==target)
        {
            return new int[]{rStart+1,cMid};
        }
        if(target <= mat[rStart][cMid-1])
        {
            return binarySearch(mat,target,rStart,0,cMid-1);
        }
        if(target <= mat[rStart+1][cMid-1])
        {
            return binarySearch(mat,target,rStart+1,0,cMid-1);
        }
        if(target>= mat[rStart][cMid+1])
        {
            return binarySearch(mat,target,rStart,cMid+1,mat[0].length-1);
        }
        else
        {
            return binarySearch(mat,target,rStart+1,cMid+1,mat[0].length-1);
        }
    }
}
