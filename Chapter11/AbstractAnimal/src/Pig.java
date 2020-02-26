public class Pig extends AbstractAnimal {
    protected Pig(String name) {
        super(name);
    }

    @Override
    public void cry() {
        System.out.println("꿀꿀");
    }
}
