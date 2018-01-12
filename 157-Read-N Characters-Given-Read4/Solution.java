/* The read4 API is defined in the parent class Reader4.
      int read4(char[] buf); */

public class Solution extends Reader4 {
    /**
     * @param buf Destination buffer
     * @param n   Maximum number of characters to read
     * @return    The number of characters read
     */
       public int read(char[] buf, int n) {
        char[] temp = new char[4];
        int result = 0;
        for (int i = 0; i<= n/4; i++){
            int cur = read4(temp);
            cur = Math.min(cur, n-result);
            for(int j = 0; j<cur; j++){
                buf[result++] = temp[j];
            }
            if(result == n) return result;
        }
        return result;
    }
}