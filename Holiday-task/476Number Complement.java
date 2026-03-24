class Solution {
    public int findComplement(int num) {
       int bitsize = 32 - Integer.numberOfLeadingZeros(num);
       int s=(1<<bitsize)-1;
       return (s^num);
        
    }
}
