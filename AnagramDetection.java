package com.bl.DataStructure;

import java.util.Arrays;

public class AnagramDetection {
		static String str1 = "Heart";
		static String str2 = "earth";

		
		public static void main(String[] args) {

			// Function Call
			if (checkAnagrams(str1, str2))
				System.out.println("The two strings are anagram of each other");
			else
				System.out.println("The two strings are not anagram of each other");
		}

		
		private static boolean checkAnagrams(String str1, String str2) {
			
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			
			char[] array1 = str1.toCharArray();
			char[] array2 = str2.toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
			
			boolean result = Arrays.equals(array1, array2);

			if (result) {
				return true;
			} else {
				return false;
			}
		}
	}

