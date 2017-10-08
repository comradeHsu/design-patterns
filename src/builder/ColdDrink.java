package builder;

public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bollte();
    }

    @Override
    public abstract float price();
}
