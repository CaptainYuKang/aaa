package Demo;

/**
 * @author:liujiazhen
 * @date:2018/12/4 11:47
 * @description:
 **/
public class Test {
    public static void main(String[] args) {
        A a = new A();
        B<A> b = new B<>();
        b.setT(a);
        System.out.println(b.getT() instanceof  A);
    }
}
