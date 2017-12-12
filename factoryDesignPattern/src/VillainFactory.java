public class VillainFactory {

    //this is our factory , it's only job is to create a villain by encapsulating villain creation
    public Villain getVillain(String villainType){
        switch (villainType){
            case "warrior":
                return new Warrior();   //creates new warrior
            case "sniper":
                return new Sniper();    //creates new sniper
            case "magician":
                return new Magician();  //creates new magician
            default:
                return null;
        }
    }
}