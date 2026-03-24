class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if(mainTank<5){
            return mainTank*10;
        }
        int cnt=0;
        while(mainTank>4){
          mainTank=mainTank-5;
          cnt=cnt+50;
           if(additionalTank>0){
            mainTank++;
            additionalTank--;
            }
          
        }
        return cnt+(mainTank*10);

    }
}
