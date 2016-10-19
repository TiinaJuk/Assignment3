package dit948;

import static dit948.SimpleIO.*;
public class Swap {
    private int a;
    static int aGlobal = 1;
    public Swap(){}
    public Swap(int a){
        this.a = a;
    }

    static void swapInts(int a, int b){
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        aGlobal = a;
        println("Value of a in swapInts is "+a);
        println("Value of aGlobal in swapInts is "+aGlobal);
    }
    static void swapObjects(Swap x, Swap y){
        int tmp;
        tmp = x.a;
        x.a = y.a;
        y.a = tmp;
        println("Value of o1.a in swapObjects is "+x.a);
    }
    public static void main(String[] args) {
        int a = 77;
        int b = 55;
        Swap o1 = new Swap(1);
        Swap o2 = new Swap();
        println("Initial value of a is "+a);
        println("Initial value of aGlobal is "+aGlobal);
        swapInts(a,b);
        println("Final value of a is "+a);

        println("Final value of aGlobal is "+aGlobal);
        println("Initial value of o1.a is: "+o1.a);
        swapObjects(o1,o2);
        println("Final value of o1.a "+o1.a);
        println("Final value of o2.a "+o2.a);
    }
}