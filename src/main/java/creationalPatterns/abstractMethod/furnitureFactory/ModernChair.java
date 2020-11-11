package creationalPatterns.abstractMethod.furnitureFactory;

public class ModernChair implements Chair {
    @Override
    public String getType() {
        return "ModernChair";
    }
}
