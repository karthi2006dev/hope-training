bool isPalindrome(long int x){
    long int n=x,rem=0,rev=0;
     
     if(x<0){
        return false;
     }
     else{
    
        while(n!=0){
          rem=n%10;
          rev=rev*10+rem;
          n=n/10;
        }
        
    
    if(rev==x){
        return true;
    }
     }
    return 0;
}
