package lesson05c.publicinner;

public class OuterClass2Main {
    public static void main(String[] args) {
        //OuterClass2.PublicInnerClass publicInnerClass2 = new OuterClass2().PublicInnerClass();

        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.PublicInnerClass publicInnerClass = outerClass2.getInnerClass();
        publicInnerClass.setName("PublicInnerClass");

        System.out.println(publicInnerClass.getName());
    }
}
