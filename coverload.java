class Generic
{
    int a=0,b=0;

    Generic()
    {
        a=b=1;
    }
    Generic(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void print()
    {
        System.out.println("a="+a+" b="+b);
    }
}
class generic{
    public static void main(String args[])
    {
        System.out.println("Default constructor call");
        Generic ga=new Generic();
        ga.print();
        System.out.println("Parameterized constructor call");
        Generic ag=new Generic(10,20);
        ga.print();
    }
}
