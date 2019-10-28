package pp.ua.standev.leetcode;

public class Solution {

    public int mySqrt(int x) {
    	
    	if (x == 0 || x == 1) {
    		return x;
    	}
    	
    	int left = 1;
    	int right = x;
    	
    	while (true) {
    		int mid = (left + right) / 2;
    		
    		if (mid > x / mid) {
    			right = mid - 1;
    		} else {
    			if (mid + 1 > x / (mid + 1)) {
    				return mid;
    			}
    			left = mid + 1;
    		}
    	}
    }
}

// 1 .... 10
// mid = r / 2
// mid = 5

// 10 .. 20
// mid = (r + l) / 2
// mid = 15

// 5 .. 15
// mid = (r + l) / 2
// mid = 10