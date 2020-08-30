package lesson05c.publicstaticinner;

public class OuterClass3 {
    private PublicStaticInnerClass publicStaticInnerClass;
    public OuterClass3(){
        publicStaticInnerClass = new PublicStaticInnerClass();
    }
    
    public PublicStaticInnerClass getInnerClass() {
        return this.publicStaticInnerClass;
    }
    
    public static class PublicStaticInnerClass {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
