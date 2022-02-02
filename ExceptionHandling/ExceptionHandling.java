import java.util.Scanner;;

// This is a custom checked exception, hence it has to be either handled using 
// Try/Catch  or  it has to be declared to be thrown using the "throws" keyword
class myCheckedException extends Exception 
{
    myCheckedException(String s) 
    {
        super(s);
    }
}

public class ExceptionHandling
 {

    // Demonstrates Try, Catch and Finally
    static void divide() 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.print("Enter two Numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + "/" + b + "= " + a / b);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: " + e);
        } 
        finally 
        {
            sc.close();
        }
    }

    static void testFunction() 
    {
        try 
        {
            System.out.println("Hello, I will now throw an Exception");
            throw new myCheckedException("This is an Exception");
        } 
        catch (myCheckedException e) 
        {
            System.out.println("Caught Excpetion: " + e);
        }
    }


    // since the Exception is thrown outside a try-catch block, 
    // we have to declare that this function has the possibility of throwing an exception
    static void testFunction2() throws myCheckedException 
    {
        System.out.println("\n I will now throw an Exception too, except, I wont handle it!");
        throw new myCheckedException("Another Exception");
    }

    public static void main(String[] args) 
    {
        divide();
        testFunction();

        // since testFunction2 throws a checked Exception, it can't be called without handling it, 
        // we have to either
        // - call it inside a try-catch block
        // - or declare that this main function also throws an exception
        // testFunction2();


        try 
        {
            testFunction2();
        }
        catch(myCheckedException e)
        {
            System.out.println("Caught the Exception: " + e);
        }
    }
}