package streamsAPI;

import java.util.*;

public class ProfileTest {
	private ProfileTest(int w) { // line 3
		System.out.println(w);
	}

	/*public static ProfileTest() { // line 6
		System.out.println(5);
	}

	public static void main(String args[]) {
		ProfileTest obj = new ProfileTest(10);
	}*/
}

/*class Test {
	public static void main(String args[]) {
		System.out.println(fun());
	}

	static int fun() {
		return 20;
	}
}*/

/*class Test1 {
    public int x, y;
}
class Main {
    public static void main(String args[]) {
        Test1 t = new Test1();
        System.out.println(t.x + " " + t.y);
    }
}*/

/*class Constructor
{
   static String str;
   public void Constructor() 
   {
      System.out.println("In constructor");
      str = "Hello World";
   }
   public static void main(String [] args)
   {
      Constructor c = new Constructor();
      System.out.println(str);
   }
}*/

/*class Test2
{
    static int a=20;
    int b=10;
    public static void main(String args[])
    {
        Test2 t=new Test2();
        t.a=30;
        t.b=40;
        System.out.println(t.a);
        System.out.println(t.b);
    }
}*/

/*class Test3 {
    public int x, y;
}
class Main {
    public static void main(String args[]) {
        Test3 t = new Test3();
        System.out.println(t.x + " " + t.y);
    }
}*/
class Super
{ 
    public int i = 0; 

    public Super(String text) /* Line 4 */
    {
        i = 1; 
    } 
} 

class Sub extends Super
{
    public Sub(String text)
    {
    	super(text);
        i = 2; 
    } 

    public static void main(String args[])
    {
        Sub sub = new Sub("Hello"); 
        System.out.println(sub.i); 
    } 
}