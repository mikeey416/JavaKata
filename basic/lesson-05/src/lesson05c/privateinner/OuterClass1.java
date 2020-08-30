package lesson05c.privateinner;

public class OuterClass1 {
    private PrivateInnerClass privateInnerClass;
    public OuterClass1(){
        privateInnerClass = new PrivateInnerClass();
    }

    public PrivateInnerClass getInnerClass() {
        return this.privateInnerClass;
    }

    private class PrivateInnerClass {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
