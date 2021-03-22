package inheritance03;

public class RightTriangle03 extends IsoscelesTriangle03 {
    @Override
    public String getName() {
        return super.getName() + " and Right Triangle" ;
    }
}
