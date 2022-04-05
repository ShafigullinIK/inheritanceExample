public class A {

    public static void main(String[] args) {
        A a = new A();
        A ab = new B();
        B b = new B();
        B bc = new C();
        A ac = new C();

        System.out.println("a = " + a);
        System.out.println("ab = " + ab);
        System.out.println("b = " + b);
        System.out.println("bc = " + bc);
        System.out.println("ac = " + ac);
    }

    @Override
    public String toString() {
        return "Class A";
    }
}
