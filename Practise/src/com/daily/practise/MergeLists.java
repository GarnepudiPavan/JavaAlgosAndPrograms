package com.daily.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeLists {

	List<Integer> mergedList = new ArrayList<Integer>();
	List<Integer> list1 = new ArrayList<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();

	public MergeLists(List<Integer> list1, List<Integer> list2) {
		this.list1 = list1;
		this.list2 = list2;
	}

	public List<Integer> mergeLists() {
		int i = 0;
		int j = 0;
		int k = 0;
		while ((i < list1.size()) && (j < list2.size())) {
			if (list1.get(i) < list2.get(j)) {
				mergedList.add(k, list1.get(i));
				i++;
				
			} else if (list1.get(i) > list2.get(j)) {
				mergedList.add(k, list2.get(j));
				j++;
				
			}
			k++;
		}
		while (i < list1.size()) {

			mergedList.add(list1.get(i));
			i++;
			k++;
		}
		while (j < list2.size()) {
			mergedList.add(list2.get(j));
			j++;
			k++;
		}
		return mergedList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> oneList = new ArrayList<Integer>();
		List<Integer> twoList = new ArrayList<Integer>();
		oneList.add(0);
		oneList.add(20);
		oneList.add(30);
		oneList.add(40);
		oneList.add(50);

		twoList.add(1);
		twoList.add(2);
		twoList.add(3);
		twoList.add(4);
		twoList.add(51);

		MergeLists obj1 = new MergeLists(oneList, twoList);
		List<Integer> mergeList = obj1.mergeLists();
		for (Integer values : mergeList) {
			System.out.println("Merged list is" + " " + values);
		}
	}

}
