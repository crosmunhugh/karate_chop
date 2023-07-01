package org.example;

import java.util.Arrays;

public class SubArray extends AbstractChop {
    @Override
    public Integer chop(Integer searchTarget, Integer[] sortedIntegerArray) {
        if (sortedIntegerArray.length == 0) {
            return -1;
        }

        int low = 0;
        int high = sortedIntegerArray.length-1;
        int mid = (low + high)/2;
        return this.binarySearchWithArray(searchTarget,sortedIntegerArray,high,mid,low,0);
    }

    private Integer binarySearchWithArray(Integer searchTarget, Integer[] subArray, int high, int mid, int low, int offset) {
        if (low > high) {
            return -1;
        } if (searchTarget.equals(subArray[mid])) {
            return mid + offset;
        } else if (searchTarget < subArray[mid]) {
            int newHigh = mid - 1;
            int newMid = (low + newHigh)/2;
            Integer[] newSubArray = Arrays.copyOfRange(subArray,low,mid);
            return binarySearchWithArray(searchTarget,newSubArray,newHigh,newMid,low,0);
        } else {
            Integer[] newSubArray = Arrays.copyOfRange(subArray,mid+1,subArray.length);
            int newLow = 0;
            int newHigh = newSubArray.length - 1;
            int newMid = (newLow + newHigh)/2;

            int newOffset = offset;

            if (newSubArray.length!=0 && subArray.length - newSubArray.length > 0) {
                newOffset = offset + (subArray.length - newSubArray.length);
            }

            return binarySearchWithArray(searchTarget,newSubArray,newHigh,newMid,newLow,newOffset);
        }
    }
}
