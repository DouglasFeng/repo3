package c4;

//import org.omg.CORBA.ObjectHolder;

import java.io.IOException;

public class Jhsdb_1 {
    static class Test{
        static ObjectHolder staticObj=new ObjectHolder();
        ObjectHolder instanceObj=new ObjectHolder();

        Test() throws IOException {
        }

        void foo()  {
            ObjectHolder lcocal=new ObjectHolder();

            System.out.println("done");
        }
    }

    private static class ObjectHolder{};

    public static void main(String[] args) throws IOException {
        Test test=new Jhsdb_1.Test();
        int i=System.in.read();
        test.foo();
    }
}
