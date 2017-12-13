public class HeroFactory extends AbstractFactory {
    @Override
    Villain getVillain(String s) {
        return null;
    }

    //  create a hero by encapsulating hero creation
    Hero getHero(String heroType) {
        switch (heroType){
            case "cop":
                return new Cop();   //creates new cop
            case "judge":
                return new Judge();    //creates new judge
            default:
                return null;
        }
    }
}
