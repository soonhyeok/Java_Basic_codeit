public class Dog extends AbstractAnimal {
    protected Dog(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("왈왈");
    }
}
