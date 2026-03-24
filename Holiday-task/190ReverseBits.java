class Solution {
    public int reverseBits(int n) {
        int num=0,i=0;
        while(n!=0){
          int s=n&1;
          num=num|(s<<(31-i));
          n=n>>1;
          i++;
        }
        return num;
    }
}
