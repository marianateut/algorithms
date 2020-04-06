package org.fastrackit;
/*
1. Given a list of n natural numbers ranging between 1 and 1,000,000,000, find the most popular k scores in the
descending order of their frequency.Input: n = 11, k = 3, numbers = [6, 5, 2, 6, 6, 2, 1, 7, 3, 3, 3]
Output: [6, 3, 2]
*/
import java.util.*;

public class TaksOffLabs {

        public static List<Integer> topKFrequent(int[] nums, int k){
            // build hash map : character and how often it appears
            HashMap<Integer, Integer> count = new HashMap();
            for (int n : nums) {
                count.put(n, count.getOrDefault(n, 0) + 1);
            }
            // init heap 'the less frequent element first'
            PriorityQueue<Integer> heap =
                    new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

            // keep k top frequent elements in the heap
            for (int n : count.keySet()) {
                heap.add(n);
                if (heap.size() > k)
                    heap.poll();
            }

            // build output list
            List<Integer> top_k = new LinkedList();
            while (!heap.isEmpty())
                top_k.add(heap.poll());
            Collections.reverse(top_k);
            return top_k;
        }
    public static void main(String args[]) {
        int v[] = {6, 5, 2, 6, 6, 2, 1, 7, 3, 3, 3};
        int n = v.length;
        int x = 3 ;
       // TaksOffLabs ob = new TaksOffLabs()
        System.out.print(topKFrequent(v, x));



    }
}




