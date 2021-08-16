public class staticVarMethodDemo
{
    static int a =0;
    static void display()
    {
        System.out.println("executing STATIC METHOD...");
    }

    static
    {
        System.out.println("executing STATIC BLOCK...");
    }

    public static void main(String[] args)
    {
        System.out.println(a);
        display();
    }
}

