public class Main {
    public static void main(String[] args) {
        VillainFactory villainFactory = new VillainFactory();

        //create a Warrior with villainFactory
        Villain villain1 = villainFactory.getVillain("warrior");
        System.out.println("Warrior was created with villainFactory!");

        //call specialAbility method
        villain1.specialAbility();
        villain1.useAbility();
        System.out.println();

        //create a Sniper with villainFactory
        Villain villain2 = villainFactory.getVillain("sniper");
        System.out.println("Sniper was created with villainFactory!");

        //call specialAbility method
        villain2.specialAbility();
        villain2.useAbility();
        System.out.println();

        //create a Magician with villainFactory
        Villain villain3 = villainFactory.getVillain("magician");
        System.out.println("Magician was created with villainFactory!");


        //call specialAbility method
        villain3.specialAbility();
        villain3.useAbility();
    }
}
