public class Cat extends AbstractAnimal {
    protected Cat(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("야옹");
    }
}
