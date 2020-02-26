public abstract class AbstractAnimal {
    public final String name;

    protected AbstractAnimal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void cry();
}
