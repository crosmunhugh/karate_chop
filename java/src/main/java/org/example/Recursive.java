package org.example;

public class Recursive extends AbstractChop {
    @Override
    public Integer chop(Integer searchTarget, Integer[] sortedIntegerArray) {
        if (sortedIntegerArray.length == 0) {
            return -1;
        }

        int low = 0;
        int high = sortedIntegerArray.length-1;
        int mid = (low + high)/2;

        return this.recursiveChop(searchTarget,sortedIntegerArray,high,mid,low);
    }

    private Integer recursiveChop(Integer searchTarget, Integer[] sortedIntegerArray, int high, int mid, int low) {
        if ( low > high) {
            return -1;
        } if (searchTarget.equals(sortedIntegerArray[mid])) {
            return mid;
        } else if (searchTarget < sortedIntegerArray[mid]) {
            int newHigh = mid - 1;
            int newMid = (low + newHigh)/2;
            return recursiveChop(searchTarget,sortedIntegerArray,newHigh,newMid,low);
        } else {
            int newLow = mid + 1;
            int newMid = (newLow + high)/2;
            return recursiveChop(searchTarget,sortedIntegerArray,high,newMid,newLow);
        }
    }
}
