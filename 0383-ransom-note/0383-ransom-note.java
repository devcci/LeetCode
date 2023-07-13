class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for ( char c : ransomNote.toCharArray()) {
            int idx = magazine.indexOf(c);

            if (idx == -1) {
                return false;
            } else {
                magazine = magazine.substring(0, idx) + magazine.substring(idx + 1);
            }
        }
        return true;
    }
}