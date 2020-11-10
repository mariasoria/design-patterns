package creationalPatterns.abstractMethod.furnitureFactory;

public class ModernAbstractFactory implements Factory {

    @Override
    public Chair createChair() {
        Chair modernChair = new ModernChair();
        return modernChair;
    }

    @Override
    public Sofa createSofa() {
        Sofa modernSofa = new ModernSofa();
        return modernSofa;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        CoffeeTable modernCoffeeTable = new ModernCoffeeTable();
        return modernCoffeeTable;
    }


}
