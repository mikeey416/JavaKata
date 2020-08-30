package lesson05c.publicstaticinner;

public class OuterClass3Main {
    public static void main(String[] args) {
        OuterClass3.PublicStaticInnerClass publicStaticInnerClass = new OuterClass3.PublicStaticInnerClass();
        publicStaticInnerClass.setName("PublicStaticInnerClass");

        System.out.println(publicStaticInnerClass.getName());
    }
}
