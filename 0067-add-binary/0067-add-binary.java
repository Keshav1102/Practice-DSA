class Solution {
    public String addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        char carry ='0';
        int al = a.length()-1, bl = b.length()-1;

        while(al>-1 || bl>-1 || carry == '1') {
            char c1 = '0', c2 = '0';
            if (bl > -1) {
                c2 = b.charAt(bl--);
            }
            if (al > -1) {
                c1 = a.charAt(al--);
            }
            if (c1 == '1' && c2 == '1') {
                if (carry == '1') {
                    str.append('1');
                } else {
                    str.append('0');
                    carry = '1';
                }
            } else if (c1 == '1' || c2 == '1') {
                if (carry == '1') {
                    str.append('0');
                } else str.append('1');
            } else {
                if (carry == '1') {
                    str.append('1');
                    carry = '0';
                } else {
                    str.append('0');
                }
            }
        }
        str.reverse();
        return str.toString();
    }
}