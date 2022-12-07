package com.code;

import java.util.*;

public class Main {
    public static int theChangeProblem(int target, int[] coins){
      //We are given a target which we have to make with a given set of coins which is contained in the array coins. We use DP.
        int[] a = new int[target+1];
        for(int item: coins){
            a[item] = 1;
        }
        for(int i=0;i<a.length;i++){
            //If this number is zero then leave it be.
            if(a[i]>0){
                int val = a[i]+1;
                for(int item: coins){
                    if(i+item<a.length && (a[i+item]==0 || a[i+item] > val)){
                        a[i+item] = val;
                    }
                }
            }
            //If this number is greater than 0 for all the changes of coins
            // if they are within the index limit of a we incrmeent 1 in a[i]
            // and see if this number is less than the number which is present there.
            //if it is smaller then we change the number there else we do not change the number there.
        }
        return a[target];
    }

    public static void main(String[] args)
    {

    }
}
