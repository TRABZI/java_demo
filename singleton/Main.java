public class Main {
    public static void main(String[] args) {
        App app0=App.getInstance();
        App app1=App.getInstance();

        app0.display_func();
        app0.display();

        app1.display_func();
        app1.display();
        System.out.println(app1.var);
    }
} 
   
    


