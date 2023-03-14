/*
**4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
package javaHomeworkWeek6;

public class Program4TwoInstanceWithTwoStatic {
    //  Declare two instance and two static variables.
    int i = 5;
    int b = 10;
    static int y = 15;
    static int z = 20;

    //main method declare
    public static void main(String[] args) {
        Program4TwoInstanceWithTwoStatic obj1 = new Program4TwoInstanceWithTwoStatic();
        obj1.instance();
        data();
    }
    // Declare one instance method.
    public void instance()
    {
        Program4TwoInstanceWithTwoStatic obj2 = new Program4TwoInstanceWithTwoStatic();
        System.out.println(obj2.i);
        System.out.println(obj2.b);
        System.out.println("Called to the instance variable::"+i);
        System.out.println("Called to the instance variable::"+b);
    }
    // Declare one static method.
    public static void data()
    {
        Program4TwoInstanceWithTwoStatic obj3 = new Program4TwoInstanceWithTwoStatic();
        System.out.println(obj3.y);
        System.out.println(obj3.z);
        System.out.println("Called to the static variable::"+y);
        System.out.println("Called to the static variable::"+z);
    }
}