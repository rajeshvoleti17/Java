class Main
{
    public static void main(String args[])
    {
        try{
            int a[]={1,2,3};
            System.out.println(a[1]);
            try{
                System.out.println(2/0);
            }
            catch(ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("from inner block");
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println("from outer block");
        }
    }
}