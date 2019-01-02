package week3HW;

import java.util.*;
class FrequencySort {

    static void customSort(int[] arr) {
        Map<Integer, CustomInteger> map = new HashMap<>();
        for (int val : arr) {
            CustomInteger customInteger = map.getOrDefault(val, new CustomInteger(val, 0));
            customInteger.freq =  customInteger.freq + 1;
            map.put(val, customInteger);
        }

        List<CustomInteger> list = new ArrayList<>();
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            list.add(map.get(itr.next()));
        }

        Collections.sort(list);

        for (CustomInteger cusInt : list) {
            for (int i = 0; i < cusInt.freq; i++) {
                System.out.println(cusInt.val);
            }
        }
    }

    static class CustomInteger implements Comparable<CustomInteger> {
        int val;
        int freq;

        CustomInteger(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(CustomInteger other) {
            if (freq == other.freq) {
                return val - other.val;
            } else {
                return other.freq - freq;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,3,4,4,5,5,5,5,6,6,6};
        customSort(arr);
    }

}
