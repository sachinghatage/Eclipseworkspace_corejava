public interface A {

     default void m3(){
        System.out.println("hello");
    }
    void m1();
   // void m2();
}

 class B implements A{
     public static void main(String[] args) {
         B b=new B();
         b.m3();

     }

    @Override
    public void m1() {
        System.out.println("hi");
    }
}

class C extends B{

    @Override
    public void m2() {

    }
}
