package org.example;

public class CeilingNonRecursive extends AbstractChop{
    @Override
    public Integer chop(Integer searchTarget, Integer[] sortedIntegerArray) {
        if (sortedIntegerArray.length == 0) {
            return -1;
        }
        int lower = 0;
        int upper = sortedIntegerArray.length - 1;

        while(lower != upper) {
            int mid = (int) Math.ceil((lower + upper)/2d);
            if (sortedIntegerArray[mid] > searchTarget) {
                upper = mid - 1;
            } else {
                lower = mid;
            }
        }
        if (sortedIntegerArray[lower].equals(searchTarget)) {
            return lower;
        }

        return -1;
    }
}
