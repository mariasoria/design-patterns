package creationalPatterns.abstractMethod.furnitureFactory;

public interface AbstractFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
