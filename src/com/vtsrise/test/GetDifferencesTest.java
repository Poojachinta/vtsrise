package com.vtsrise.test;

import org.junit.Test;

import com.vtsrise.impl.GetDifferences;

public class GetDifferencesTest {
	
	@Test
	public void test1() {
		GetDifferences gd = new GetDifferences();
		String[] arrA = new String[] { "Ram", "Shyam", "Dexter" };
		String[] arrB = new String[] { "Olivia", "Shyam", "haloil", "Dexter", "Ram" };
		gd.findMissing(arrA, arrB);
	}
	
	@Test
	public void test2() {
		GetDifferences gd = new GetDifferences();
		String[] arrA = new String[] { "Ram", "Shyan", "Dexter" };
		String[] arrB = new String[] { "Ram", "Shyan", "Dexter" };
		gd.findMissing(arrA, arrB);
	}
	
	@Test
	public void test3() {
		GetDifferences gd = new GetDifferences();
		String[] arrA = new String[] { "Olivia", "Shyam", "haloil", "Dexter", "Ram"};
		String[] arrB = new String[] { "Santos", "Dexter", "shyam" };
		gd.findMissing(arrA, arrB);
	}
}
