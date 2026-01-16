package org.personal.leetcode.easy;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "Hello World";

        // 1. Using extra space O(n)
        //Time complexity: O(n)
        //Space complexity: O(n)
        String reversed1 = reverseStringUsingExtraSpace(str);
        System.out.println(reversed1);

        // 2. In place O(n)
        //Time complexity: O(n)
        //Space complexity: O(1)
        String reversed2 = reverseStringInPlace(str);
        System.out.println(reversed2);

        // 3. Recursive O(n)
        //Time complexity: O(n)
        //Space complexity: O(n)
        String reversed3 = reverseStringRecursively(str);
        System.out.println(reversed3);

        // 4. Using StringBuilder O(1)
        //Time complexity: O(n)
        //Space complexity: O(1)
        String reversed4 = reverseStringUsingStringBuilder(str);
        System.out.println(reversed4);
    }


        // Implementations
        private static String reverseStringUsingExtraSpace(String str) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            char[] reversedArray = new char[length];
            for (int i = 0; i < length; i++) {
                reversedArray[length - i - 1] = charArray[i];
            }
            return new String(reversedArray);
        }

        private static String reverseStringInPlace(String str) {
            char[] charArray = str.toCharArray();
            int i = 0, j = charArray.length - 1;
            while (i < j) {
                char temp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = temp;
                i++;
                j--;
            }
            return new String(charArray);
        }

        private static String reverseStringRecursively(String str) {
            if (str.length() <= 1) {
                return str;
            }
            return reverseStringRecursively(str.substring(1)) + str.charAt(0);
        }

        private static String reverseStringUsingStringBuilder(String str) {
            StringBuilder stringBuilder = new StringBuilder(str);
            return stringBuilder.reverse().toString();

    }
}
