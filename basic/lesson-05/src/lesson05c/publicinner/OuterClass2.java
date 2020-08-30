package lesson05c.publicinner;

public class OuterClass2 {
    private PublicInnerClass publicInnerClass;
    public OuterClass2(){
        publicInnerClass = new PublicInnerClass();
    }

    public PublicInnerClass getInnerClass() {
        return this.publicInnerClass;
    }

    public class PublicInnerClass {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
