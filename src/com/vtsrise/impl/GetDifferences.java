package com.vtsrise.impl;

import java.util.ArrayList;
import java.util.List;

public class GetDifferences {
	public String[] findMissing(String[] arrA, String[] arrB) {
		List<String> list = new ArrayList<String>();
		for (String name : arrA) {
			list.add(name);
		}
		for (String name : arrB) {
			if (!list.contains(name)) {
				list.add(name);
			}
		}
		String[] a = list.toArray(new String[list.size()]);
		return a;
	}
}