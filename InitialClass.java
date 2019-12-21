interface ShowPolymorphism
{
    void runTimePolymorphism(); //Function to show polymorphism
}

class ShowPolymorphism1 implements ShowPolymorphism
{
    public void runTimePolymorphism()
    {
        System.out.println("This was runtime polymorphism from class ShowPolymorphism1"); //Runtime polymorphism method 1
    }
}

class ShowPolymorphism2 implements ShowPolymorphism
{
    public void runTimePolymorphism()
    {
        System.out.println("This was runtime polymorphism from class ShowPolymorphism2"); //Runtime polymorphism method 2
    }
}

class ShowCompileTimePolymorphism
{
    void compileTimePolymorphism()
    {
        System.out.println("Compile time polymorphism 1"); //Function overload with no parameter
    }

    void compileTimePolymorphism(int n)
    {
        System.out.println("Compile time polymorphism 2"); //Function overload with int parameter
    }
}

class SuperClass //Base class
{
    void show()
    {
        System.out.println("Showing inheritance: super class");
    }
}

class InheritedClass extends SuperClass //Derived class
{
    void show()
    {
        super.show(); //show() of super class
        System.out.println("Showing inheritance: inherited class");
    }
}

class ShowEncapsulation
{
   private int n; //data member encapsulated in object
 int getN() //getter function
{
return n;
}

int setN(int n) //setter function
{
this.n=n;
}
}

public class InitialClass
{
    public static void main(String args[])
    {
        System.out.println("Showing Encapsulation: int n and show() are encapsulated in object ob1");
        ShowEncapsulation ob1=new ShowEncapsulation();
        System.out.println("Setting n to 5");
ob1.setN(5);
System.out.println("n= "+ob1.getN());
        System.out.println();
        System.out.println("Showing inheritance");
        BaseClass ob2=new BaseClass();
        ob2.show();
        System.out.println();
        System.out.println("Showing runtime polymorphism");
        ShowPolymorphism ob3=new ShowPolymorphism1();
        ob3.runTimePolymorphism();
        ob3=new ShowPolymorphism2();
        ob3.runTimePolymorphism();
        System.out.println();
        System.out.println("Showing compile time polymorphism");
        ShowCompileTimePolymorphism ob4=new ShowCompileTimePolymorphism();
        ob4.compileTimePolymorphism();
        ob4.compileTimePolymorphism(0);
    }
}
