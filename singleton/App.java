public class App{
    private static App app=null;
    private App(){
    }

    public static App getInstance(){
        if(null==app){
            app=new App();
        }
        return app;
    }

    public static void display_func(){
        System.out.println("Hello, your are calling display_func ...");
    }
}



    


