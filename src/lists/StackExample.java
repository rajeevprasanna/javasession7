package lists;

import java.util.Stack;

/*

Given an array, print the Next Greater Element (NGE) for every element. 
The Next greater Element for an element x is the first greater element on the right side of x in array. 
Elements for which no greater element exist, consider next greater element as -1.

Examples:
a) For any array, rightmost element always has next greater element as -1.
b) For an array which is sorted in decreasing order, all elements have next greater element as -1.

c) For the input array [4, 5, 2, 25}, the next greater elements for each element are as follows.
Element       NGE
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1

d) For the input array [13, 7, 6, 12}, the next greater elements for each element are as follows.
  Element        NGE
   13      -->    -1
   7       -->     12
   6       -->     12
   12     -->     -1

 */
public class StackExample {
	public static void main(String[] args) {
		 
		int[] a = { 13, 7, 6, 12 };
		Stack<Integer> stack = new Stack<Integer>();
 
		for (int i = 0; i < a.length; i++) {
			while (!stack.isEmpty() && a[i] > stack.peek()) {
				System.out.println(a[i] + " is next greater element for " + stack.peek());
				stack.pop();
			}
			stack.push(a[i]);
		}
 
		// After completing of iteration, remaining elements in stack doesn't
		// have any greater element
		while (!stack.isEmpty()) {
			System.out.println(-1 + " is next greater element for " + stack.pop());
		}
	}
}
