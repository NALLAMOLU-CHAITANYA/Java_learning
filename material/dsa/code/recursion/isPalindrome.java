package material.dsa.code.recursion;
//  https://leetcode.com/problems/valid-palindrome/description/
public class isPalindrome {
    public boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    private boolean helper(String s, int left, int right) {
        // Move left pointer to next alphanumeric character
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        // Move right pointer to previous alphanumeric character
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }

        // Base case: pointers crossed
        if (left >= right) {
            return true;
        }

        // Compare characters ignoring case
        return (Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right)) && helper(s, left + 1, right - 1));
    }
}