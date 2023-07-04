package org.example;

public class CeilingRecursive extends AbstractChop{
    @Override
    public Integer chop(Integer searchTarget, Integer[] sortedIntegerArray) {
        if (sortedIntegerArray.length == 0) {
            return -1;
        }
        int lower = 0;
        int upper = sortedIntegerArray.length - 1;

        return recursiveChop(searchTarget,sortedIntegerArray,upper,lower);
    }

    public Integer recursiveChop(Integer searchTarget, Integer[] sortedIntegerArray, int high, int low) {
        if (low == high) {
            if (sortedIntegerArray[low].equals(searchTarget)) {
                return low;
            } else {
                return -1;
            }
        } else {
            int mid = (int) Math.ceil((low + high)/2d);
            if (sortedIntegerArray[mid] > searchTarget) {
                int newHigh = mid - 1;
                return recursiveChop(searchTarget,sortedIntegerArray,newHigh,low);
            } else {
                int newLow = mid;
                return recursiveChop(searchTarget,sortedIntegerArray,high,newLow);
            }
        }

    }
}
