package com.example.datastructure;

/**
 * *****************************************************************************
 * Given a positive integer X, write a function which returns True if X is a perfect square else False.
 * *****************************************************************************
 * Input:  X = 16
 * Output: true
 * 
 * Input:  X = 14
 * Output: false
 * 
 * *****************************************************************************
 * Constraints: 
 * 1 <= X <= 2^31 - 1
 * 
 * *****************************************************************************
 */

public class A02_checkIfPerfectSquare {
	/*
	 * ------------------------
	 * ---O(n) TIME SOLUTION---
	 * ------------------------
	 * Similar as previous
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---O(n) TIME SOLUTION---
	 * ------------------------
	 * The previous logic of 'X/i == i' cannot be done here because in integer division we lose the fraction part.
	 *   when X=4, i=2 ---- (X/i == i) becomes TRUE
	 *   when X=5, i=2 ---- (X/i == i) becomes TRUE
	 * 
	 * So, 5 will be considered as perfect square which is Wrong.
	 * So, we must use 'i*i == X' logic here.
	 * To do so, we cannot take 'i' as integer, rather should be taken as 'long'
	 * 
	 * 
	 * ----------
	 * public boolean isPerfectSquare(int X) {
	 *    if (X == 0 || X == 1)
	 *       return true;
	 *    
	 *    long start = 1;
	 *    long end = X;
	 *    
	 *    while (start <= end) {
	 *       long mid = (start + (end - start)/2);
	 *       
	 *       if (mid * mid == X)
	 *          return true;
	 *       
	 *       else if (mid * mid < X)
	 *          start = mid + 1;
	 *       
	 *       else
	 *          end = mid - 1;
	 *       
	 *    }
	 *    return false;
	 * }
	 * 
	 */
}
