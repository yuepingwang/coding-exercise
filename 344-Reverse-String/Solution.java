class Solution {
    public String reverseString(String s) {
        char[] chars = s.toCharArray();
        int size = chars.length;
        for (int i = 0; i<size/2;i++){
            char temp = chars[size-1-i];
            chars[size-1-i] = chars[i];
            chars[i] = temp;
        }
        return String.valueOf(chars);
    }
}