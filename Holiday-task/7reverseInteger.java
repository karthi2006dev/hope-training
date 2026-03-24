int reverse(signed long long int x){
    signed long long int rev=0;
    signed long long int n;
while(x!=0){
    n=x%10;
    rev=rev*10+n;
    x=x/10;
}
if(rev>=-2147483647&&rev<=2147483647){
    return rev;
}
else{
    return 0;
}

}
