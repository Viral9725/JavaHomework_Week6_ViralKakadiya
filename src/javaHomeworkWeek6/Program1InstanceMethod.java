
package javaHomeworkWeek6;
/*
**
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1InstanceMethod
{
    //Declare two instance variables.
    int i=5;
    int b=10;
    //Declare the Main method.
    public static void main(String[] args)
    {
        Program1InstanceMethod obj1 = new Program1InstanceMethod();
        obj1.InstanceVariables();

    }
// Declare one instance method.
    public void InstanceVariables()
    {
        Program1InstanceMethod obj1 = new Program1InstanceMethod();
        System.out.println(obj1.i);
        System.out.println("Called to the Static variable::"+i);
        System.out.println(obj1.b);
        System.out.println("Called to the Static variable::"+b);
    }
}



