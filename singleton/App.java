public class App{
    
    private static App app=null;
    
    public int var =10;

    private App()
    {
        System.out.println("App constructor");
    }

    public void display_func(){
        System.out.println("Hello, your are calling display_func ...");
    }
    public void display(){
        System.out.println(var);
    }

    public static App getInstance()
    {
        if(null==app)
        {
            app=new App();
        }
        return app;
    }

}



    


