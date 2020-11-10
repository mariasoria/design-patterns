package creationalPatterns.abstractMethod.furnitureFactory;

public class ArtDecoAbstractFactory implements Factory {
    @Override
    public Chair createChair() {
        Chair artDecoChair = new ArtDecoChair();
        return artDecoChair;
    }

    @Override
    public Sofa createSofa() {
        Sofa artDecoSofa = new ArtDecoSofa();
        return artDecoSofa;
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        CoffeeTable artDecoCoffeeTable = new ArtDecoCoffeeTable();
        return artDecoCoffeeTable;
    }
}
