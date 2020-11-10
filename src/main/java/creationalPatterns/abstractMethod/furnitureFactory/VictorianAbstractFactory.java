package creationalPatterns.abstractMethod.furnitureFactory;

public class VictorianAbstractFactory implements Factory {
    @Override
    public Chair createChair() {
        Chair victorianChair = new VictorianChair();
        return victorianChair;
    }

    @Override
    public Sofa createSofa() {
        Sofa victorianSofa = new VictorianSofa();
        return victorianSofa;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        CoffeeTable victorianCoffeeTable = new VictorianCoffeeTable();
        return victorianCoffeeTable;
    }
}
