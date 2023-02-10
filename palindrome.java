class palindrome
{
public static void main(String args[])
{
int temp ,r,sum=0;
int n=454;
temp=n;

while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("number is palindrome");
}
}
}
