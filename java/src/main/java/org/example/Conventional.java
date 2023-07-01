package org.example;

public class Conventional extends AbstractChop {
    public Integer chop(Integer searchTarget, Integer[] sortedIntegerArray) {
       int low = 0;
       int high = sortedIntegerArray.length-1;

       while (low <= high) {
           int mid = (low + high)/2;

           if (searchTarget.equals(sortedIntegerArray[mid])) {
               return mid;
           } else if (searchTarget < sortedIntegerArray[mid]) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
       return -1;
    }
}