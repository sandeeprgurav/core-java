package com.leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.StringUtils;

public class DegreeOfArrays {

	public int findShortestSubArray(int[] nums) {
		Map<Integer, Integer> left = new HashMap(), right = new HashMap(), count = new HashMap();
         
		for (int i = 0; i < nums.length; i++) {
			int x = nums[i];
			if (left.get(x) == null)
				left.put(x, i);
			right.put(x, i);
			count.put(x, count.getOrDefault(x, 0) + 1);
		}

		int ans = nums.length;
		int degree = Collections.max(count.values());
		for (int x : count.keySet()) {
			if (count.get(x) == degree) {
				ans = Math.min(ans, right.get(x) - left.get(x) + 1);
			}
		}
		return ans;
	}

	public static void main(String args[]) throws Exception {
		String thisLine = null;
		int length = 0;
		String arrayData = null;
		int[] array = null;
		List s = new ArrayList();
		DegreeOfArrays obj1 =new DegreeOfArrays();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (StringUtils.isEmpty(thisLine = br.readLine()) == false) {
			// System.out.println(thisLine);
			if (StringUtils.isEmpty(thisLine) == false) {
				if (thisLine.length() > 1) {
					arrayData = thisLine;
				} else {
					length = Integer.parseInt(thisLine);
				}
			}
		}

		String[] strArray = arrayData.split(" ");
		array = new int[length];

		for (int i = 0; i < strArray.length; i++) {
			array[i] = Integer.parseInt(strArray[i]);
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			if (!set.add(array[i])) {
				System.out.println(array[i]);
				break;
			}
		}
	}
}
