package creationalPatterns.abstractMethod.furnitureFactory;

public class VictorianConcreteFactory implements AbstractFactory {
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