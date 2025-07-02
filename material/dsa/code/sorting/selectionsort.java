package material.dsa.code.sorting;

import java.util.ArrayList;
import java.util.Collections;
// my implementation  ->  swapping the current element to the left until it goes to the place where it belongs.
// public class selectionsort {
//     public static void myarraysort(ArrayList<Integer> l) {
//         System.out.println("hi");
//         for (int i=1;i<l.size();i++){
//             for (int j=i-1;j>=0;j--){
//                 if(l.get(j)>l.get(j+1)) Collections.swap(l,j,j+1);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> l = new ArrayList<Integer> ();
//         l.add(21);
//         l.add(17);
//         l.add(3);
//         l.add(6);
//         l.add(18);
//         l.add(9);
//         myarraysort(l);
//         System.out.println(l);
//     }
// }

// sir implementation - moving the left array and placing the current element (i) where it belongs. (instead of swapping at every place we are storing and at last placing in its position).
public class selectionsort {
    public static void myarraysort(ArrayList<Integer> l) {
        System.out.println("hi");
        for (int i=1;i<l.size();i++){
            int k=l.get(i);
            int j=i-1;
            while(j>=0 && l.get(j)>k) {
                l.set(j+1, l.get(j));
                j--;
            }
            l.set(j+1,k);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer> ();
        l.add(21);
        l.add(17);
        l.add(3);
        l.add(6);
        l.add(18);
        l.add(9);
        myarraysort(l);
        System.out.println(l);
    }
}