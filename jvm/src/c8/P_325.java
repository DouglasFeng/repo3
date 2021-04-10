package c8;
import static java.lang.invoke.MethodHandles.lookup;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

public class P_325 {
    class GrandFather {
        void thinking() throws Throwable {
            System.out.println("I am grandFather");
        }
    }

        class Father extends GrandFather{
            void thinking() throws Throwable {
                System.out.println("I am father");
            }

        }

        class Son extends Father
        {
            void thinking() throws Throwable {
                try{
                    MethodType mt=MethodType.methodType((void.class));
                    Field lookupImpl= MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                    lookupImpl.setAccessible(true);
                    MethodHandle mh=((MethodHandles.Lookup) lookupImpl.get(null)).findSpecial(GrandFather.class,"thinking",mt,GrandFather.classb );
                    mh.invoke(this);
                }catch (Exception e)
                {

                }
            }
        }


        public static void main(String[] args) throws Throwable {
            (new P_325().new Son()).thinking();
        }



}
