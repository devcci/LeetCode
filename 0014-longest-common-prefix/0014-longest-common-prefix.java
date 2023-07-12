class Solution {
    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        if(strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i <= strs[0].length(); i++) {
            answer = strs[0].substring(0, i);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].length() < i) {
                    return answer.substring(0, i-1);
                }

                if(!answer.equals(strs[j].substring(0, i))) {
                        return answer.substring(0, i-1);
                }
            }
        }
        return answer;
    }
}