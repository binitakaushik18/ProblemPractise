package com.arraysum;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.*;

/**
 * Created by binita on 09/03/15.
 */
public class ArraySumImpl implements ArrayElementSum {
    @Override
    public Map<String, Integer> findPairs(List<Integer> integerList) {
        if(integerList == null || integerList.isEmpty())
        {
            throw new IllegalArgumentException("Empty list not allowed");
        }
        Map<String,Integer> pair  = Maps.newHashMap();
        Collections.sort(integerList);
        //check for zero
        /*int i=0;
        int j=i-1;*/
        for(int i=0;i<=integerList.size()-1;i++){
            for(int j=i+1;j<integerList.size();j++){
               Integer elementSum = integerList.get(i)+integerList.get(j);
                if(searchElementWithSum(elementSum,integerList)>0) {
                    pair.put(integerList.get(i)+","+integerList.get(j),elementSum);
                }

            }
        }
        return pair;
    }
    private Integer searchElementWithSum(Integer elementSum,List<Integer> integerList){
        if(integerList.contains(elementSum)){
            return elementSum;
        }
        return 0;
    }

    void numberPairsForSum(List<Integer> numberList, int sum) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : numberList) {
            if (set.contains(sum - num)) {
                String s = num + ", " + (sum - num) + " add up to " + sum;
                System.out.println(s);
            }
            set.add(num);
        }
    }

    public static void main(String[] args) {
        ArraySumImpl elementSum = new ArraySumImpl();
        List<Integer> numberList = Lists.newArrayList(1, 2, 3);
        elementSum.numberPairsForSum(numberList,3);
    }
}
