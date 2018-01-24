//Beats 82.62% submissions! :)
class Solution {
    public int myAtoi(String str) {
        if(str == null || str.isEmpty()) return 0;
        char [] input = str.toCharArray();
        int sign = 1;
        boolean hasSign = false;
        int i = 0;
        int size = input.length;
        long result = 0;
        
        while(input[i]<48 || input[i]>57){
            if (input[i] == ' ')
                i++;
            else if(input[i] == '-' || input[i] == '+'){
                if (input[i] == '-')
                    sign = -1*sign;
                i++;
                if(i==size) return 0;
                break;
            }
            else return 0;
            if(i==size) return 0;
        }
        
        while (input[i]>47 && input[i]<58){
            result = result*10 + input[i] - '0';
            i++;
            if(i == size ||result<Integer.MIN_VALUE ||result>Integer.MAX_VALUE) break;
        }
        result = sign * result;
        
        if(result<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(result>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        return (int)result;
    }
}