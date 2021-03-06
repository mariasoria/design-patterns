package creationalPatterns.abstractMethod.furnitureFactory;

public class Main {

    public static String createFurniture(String style, String pieceOfFurniture) {
        if (style.equals("Modern")) {
            ModernConcreteFactory modernFactory = new ModernConcreteFactory();
            if(pieceOfFurniture.equals("Chair")) {
                Chair modernChair = modernFactory.createChair();
                return modernChair.getType();
            } else if (pieceOfFurniture.equals("Sofa")) {
                Sofa modernSofa = modernFactory.createSofa();
                return modernSofa.getType();
            } else {
                CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();
                return modernCoffeeTable.getType();
            }
        } else if (style.equals("ArtDeco")) {
            ArtDecoConcreteFactory artDecoFactory = new ArtDecoConcreteFactory();
            if(pieceOfFurniture.equals("Chair")) {
                Chair artDecoChair = artDecoFactory.createChair();
                return artDecoChair.getType();
            } else if (pieceOfFurniture.equals("Sofa")) {
                Sofa artDecoSofa = artDecoFactory.createSofa();
                return artDecoSofa.getType();
            } else {
                CoffeeTable artDecoCoffeeTable = artDecoFactory.createCoffeeTable();
                return artDecoCoffeeTable.getType();
            }
        } else {
            VictorianConcreteFactory victorianFactory = new VictorianConcreteFactory();
            if(pieceOfFurniture.equals("Chair")) {
                Chair victorianChair = victorianFactory.createChair();
                return victorianChair.getType();
            } else if (pieceOfFurniture.equals("Sofa")) {
                Sofa victorianSofa = victorianFactory.createSofa();
                return victorianSofa.getType();
            } else {
                CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();
                return victorianCoffeeTable.getType();
            }
        }
    }
}