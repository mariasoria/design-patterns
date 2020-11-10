package creationalPatterns.abstractMethod.furnitureFactory;

public interface Factory {
    Chair createChair();

    Sofa createSofa();

    CoffeeTable createCoffeeTable();
}
