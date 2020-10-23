package MethodOverriding;

public abstract class BaseClass {

    public void doStuff() {
        System.out.println("Called BaseClass Do Stuff");
    }

    public abstract void doAbstractStuff();
    
    public static void main(String[] args) {
        BaseClass a = new ConcreteClassOne();
        a.doStuff(); //Called BaseClass Do Stuff
        a.doAbstractStuff(); //Called ConcreteClassOne Do Stuff

        BaseClass b = new ConcreteClassTwo();
        b.doStuff(); //Overriding BaseClass Do Stuff
        b.doAbstractStuff(); //Called ConcreteClassTwo Do Stuff

        BaseClass c = new ConcreteClassThree();
        c.doStuff(); //Called BaseClass Do Stuff
                        //-Overriding BaseClass Do Stuff
        c.doAbstractStuff(); //Called ConcreteClassThree Do Stuff
    }
}

 class ConcreteClassOne extends BaseClass{

    public void doAbstractStuff() {
        System.out.println("Called ConcreteClassOne Do Stuff");
    }
}

 class ConcreteClassTwo extends BaseClass{

    public void doStuff() {
        System.out.println("Overriding BaseClass Do Stuff");
    }
    public void doAbstractStuff() {
        System.out.println("Called ConcreteClassTwo Do Stuff");
    }
}

 class ConcreteClassThree extends BaseClass{

    public void doStuff() {
        super.doStuff();
        System.out.println("-Overriding BaseClass Do Stuff");
    }
    public void doAbstractStuff() {
        System.out.println("Called ConcreteClassThree Do Stuff");
    }
}

