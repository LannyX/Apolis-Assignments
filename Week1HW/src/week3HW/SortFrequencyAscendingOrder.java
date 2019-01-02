package week3HW;

import java.util.*;

class SortFrequencyAscendingOrder {

	static void customSort(int[] arr) {
		Map<Integer, MyInteger> map = new HashMap<>();
		for (int value : arr) {
			MyInteger myInteger = map.getOrDefault(value, new MyInteger(value, 0));
			myInteger.frequency = myInteger.frequency + 1;
			map.put(value, myInteger);
		}

		List<MyInteger> list = new ArrayList<>();
		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			list.add(map.get(itr.next()));
		}

		Collections.sort(list);

		for (MyInteger cusInt : list) {
			for (int i = 0; i < cusInt.frequency; i++) {
				System.out.println(cusInt.value);
			}
		}
	}

	static class MyInteger implements Comparable<MyInteger> {
		int value;
		int frequency;

		MyInteger(int value, int frequency) {
			this.value = value;
			this.frequency = frequency;
		}

		@Override
		public int compareTo(MyInteger other) {
			if (frequency == other.frequency) {
				return value - other.value;
			} else {
				return frequency - other.frequency;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,
				3,
				1, 1, 1, 
				2,
				2,
				4};
//				2, 2, 1, 1, 1, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6 };
		customSort(arr);
	}

}

