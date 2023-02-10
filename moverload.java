class Overload
{
int a=0,b=0;
void add()
{
System.out.println("no");
}
void add(int k, int j)
{
a=k;
b=j;
System.out.println("sum="+(a+b));
}
}
class overload{
    public static void main(String args[])
    {
        Overload old=new Overload();

        System.out.println("Default Method call");
        old.add();
        System.out.println("Parameterized Method call");
        old.add(12,23);
    }
}
