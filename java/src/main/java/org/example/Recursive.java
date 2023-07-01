package org.example;

public class Recursive extends AbstractChop {
    @Override
    public Integer chop(Integer searchTarget, Integer[] sortedIntegerArray) {
        int low = 0;
        int high = sortedIntegerArray.length-1;
        int mid = (low + high)/2;

        return this.recursiveChop(searchTarget,sortedIntegerArray,low,mid,high);
    }

    private Integer recursiveChop(Integer searchTarget, Integer[] sortedIntegerArray, int high, int mid, int low) {
        if (low < high) {
            return null;
        } else if (searchTarget.equals(sortedIntegerArray[mid])) {
            return mid;
        } else if (searchTarget < sortedIntegerArray[mid]) {
            high = mid - 1;
            return this.recursiveChop(searchTarget,sortedIntegerArray,high,mid,low);
        } else {
            low = mid + 1;
            return this.recursiveChop(searchTarget,sortedIntegerArray,high,mid,low);
        }
    }
}
