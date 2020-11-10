package creationalPatterns.abstractMethod.furnitureFactory;

public class Main {

    public static String createFurniture(String style, String type) {
        if (style.equals("Modern")) {
            ModernAbstractFactory modernFactory = new ModernAbstractFactory();
            if(type.equals("Chair")) {
                Chair modernChair = modernFactory.createChair();
                return modernChair.getType();
            } else if (type.equals("Sofa")) {
                Sofa modernSofa = modernFactory.createSofa();
                return modernSofa.getType();
            } else {
                CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();
                return modernCoffeeTable.getType();
            }
        } else if (style.equals("ArtDeco")) {
            ArtDecoAbstractFactory artDecoFactory = new ArtDecoAbstractFactory();
            if(type.equals("Chair")) {
                Chair artDecoChair = artDecoFactory.createChair();
                return artDecoChair.getType();
            } else if (type.equals("Sofa")) {
                Sofa artDecoSofa = artDecoFactory.createSofa();
                return artDecoSofa.getType();
            } else {
                CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable();
                return artDecoCoffeeTable.getType();
            }
        } else {
            VictorianAbstractFactory victorianFactory = new VictorianAbstractFactory();
            if(type.equals("Chair")) {
                Chair victorianChair = victorianFactory.createChair();
                return victorianChair.getType();
            } else if (type.equals("Sofa")) {
                Sofa victorianSofa = victorianFactory.createSofa();
                return victorianSofa.getType();
            } else {
                CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();
                return victorianCoffeeTable.getType();
            }
        }
    }
}
