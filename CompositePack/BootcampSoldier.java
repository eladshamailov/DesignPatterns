package CompositePack;

public class BootcampSoldier implements Soldier
{
    private String name;
    private long armyId;
    private String dateOfRecruit;

    public BootcampSoldier(long armyId, String name, String dateOfRecruit)
    {
        this.name = name;
        this.armyId = armyId;
        this.dateOfRecruit = dateOfRecruit;
    }

    @Override
    public void printSoldierDetails()
    {
        System.out.println("Soldier " + name+ ",ID: " + armyId + " which joined the army at " + dateOfRecruit);
    }
}