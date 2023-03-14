package javaHomeworkWeek6;

/*
** 3. Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Program3InstanceWithStatic {
    int i = 10;
    static int b = 20;
    // Declare the Main method.
    public static void main(String[] args)
    {
        Program3InstanceWithStatic obj3 = new Program3InstanceWithStatic();
        // Call both instance and static methods into the Main method and run the programme.
        obj3.instance();
        data();
    }
    //Declare one instance method.
    public void instance()
    {
        Program3InstanceWithStatic obj1 = new Program3InstanceWithStatic();
        System.out.println(obj1.i);
        System.out.println("Called to the Instance variable::"+i);
    }
    //Declare one static method.
    public static void data()
    {
        Program3InstanceWithStatic obj2 = new Program3InstanceWithStatic();
        System.out.println(obj2.b);
        System.out.println("Called to the Static variable::"+b);
    }
}