public class StaticInstance {
    public  static  void main(String[] args)
    {
        //call instance method
        var obj = new SomeClass();
        obj.InstanceMethod();

        //call static method
        SomeClass.staticMethod();
    }
}

class SomeClass
{
    public static void  staticMethod()
    {
        System.out.println("This is static method instance class");
    }

    public  void  InstanceMethod()
    {
        System.out.println("This is instance method from instance class");

    }

}

