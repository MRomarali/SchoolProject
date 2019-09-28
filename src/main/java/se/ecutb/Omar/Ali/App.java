package se.ecutb.Omar.Ali;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        welcome();
    }
    public static void welcome(){
        System.out.println("Welcome to school management system\n" +
                        "=====================================\n" +
                "\t\t\t\tType\n" +
                "1: To Create new courses and students\n" +
                "2: To Register and remove students to/from courses\n" +
                "3: To Find students and courses\n" +
                "4: To Edit students and courses\n" +
                "====================================="
        );
    }
}
