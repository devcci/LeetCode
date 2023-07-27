import java.util.*;

class Solution {
    public int myAtoi(String s) {
        boolean negative = false;
        List<Integer> resultList = new ArrayList<>();
        s.trim();
        StringTokenizer st = new StringTokenizer(s, " ");

        if (!st.hasMoreTokens()) return 0;
        String target = st.nextToken();


        for (int i = 0; i < target.length(); i++) {
            if (Character.isDigit(target.charAt(i))) {
                resultList.add(target.charAt(i)-'0');
            } else if (target.charAt(i) == '-' && i < 1) {
                negative = true;
            } else if (target.charAt(i) == '+' && i < 1) {
                continue;
            } else {
                break;
            }
        }
        
        if (resultList.isEmpty()) return 0;
            long result = resultList.get(0);
        if(negative) result *= -1;
        for (int i = 1; i < resultList.size(); i++) {
        if (negative) {
            result = result * 10 - resultList.get(i);
            } else {
            result = result * 10 + resultList.get(i);
            }
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) result;
    }
}