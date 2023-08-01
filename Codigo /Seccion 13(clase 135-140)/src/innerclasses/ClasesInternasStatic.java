package innerclasses;

class ExtenalStatic {
    public void food(){
        System.out.println("Foo");
    }

   static class InternalStatic {
        void bar(){
            System.out.println("Bar");
        }
    }
}
public class ClasesInternasStatic {
    public static void main(String[] args) {
        ExtenalStatic.InternalStatic obj = new ExtenalStatic.InternalStatic();
        obj.bar();
    }
}
