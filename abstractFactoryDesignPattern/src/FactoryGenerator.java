public class FactoryGenerator {
    /*
    generates new factory
    we can generate Villain factory or Hero factory
     */

    public static AbstractFactory factory(String s){
        switch (s){
            case "hero":
                return new HeroFactory();
            case "villain":
                return new VillainFactory();
            default: return null;
        }
    }
}
