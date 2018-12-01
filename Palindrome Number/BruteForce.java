class Solution {
    public boolean isPalindrome(int x) {
        if(x == 0)
            return true;
        if(x < 0)
        	return false;
        String s = Integer.toString(x);
		return isPalindrome(s);
    }
	
	public boolean isPalindrome(String s) {
		int l = s.length();
		for (int i = 0; i < l; i++) {
			if(s.charAt(i) != s.charAt(l-i-1))
				return false;
		}
		return true;
	}
}
