package com.arraysum;

/**
 * Created by binita on 09/03/15.
 */
public class SortedArrayMergeImplTest {
    public Integer[] merge(Integer[] a1,Integer[] a2){
        Integer[] k = new Integer[a1.length+a2.length];
        int i=0;
        int j=0;

        while((i<= a1.length) && (j< a2.length)) {
            if (a1[i] < a2[j]) {
                k[i] = a1[i];
            }
            if (a2[i] < a1[i]) {
                k[i] = a2[i];
            }
            i++;
            j++;
        }
        while(j<= a2.length && i<=a1.length) {

                k[j] = a1[j];
            j++;
        }

        return k;
    }

    public static void main(String[] args) {
        SortedArrayMergeImplTest test = new SortedArrayMergeImplTest();
        Integer[] a1 = new Integer[]{1,2,4,5,6};
        Integer[] a2 = new Integer[]{-1,0,3,7};
        Integer[] k = test.merge(a1,a2);
        Integer[] expectedArray = new Integer[]{-1,0,1,2,3,4,5,6,7};
     }
}
