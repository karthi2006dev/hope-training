class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    int sum=numBottles,rem;
    while(numBottles!=0){
        sum=sum+(numBottles/numExchange);
         rem=numBottles%numExchange;
        numBottles=(numBottles/numExchange)+rem;
        if(numBottles/numExchange==0){
            numBottles=numBottles-rem;
        }
    }
    return sum;
        
    }
}
