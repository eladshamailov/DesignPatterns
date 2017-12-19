public class Main {
    /*
    We will create an Abstract factory in order to generate villainFactory and heroFactory. 
    those factories will generate heros and villains.
    */
    public static void main(String[] args) {
        //creates new Villain factory
        AbstractFactory villainGenerator= FactoryGenerator.factory("villain");


        //create a Warrior
        Villain villain1 = villainGenerator.getVillain("warrior");
        System.out.println("Warrior was created!");

        //call specialAbility method
        villain1.specialAbility();
        villain1.useAbility();
        System.out.println();

        //create a Sniper
        Villain villain2 = villainGenerator.getVillain("sniper");
        System.out.println("Sniper was created!");

        //call specialAbility method
        villain2.specialAbility();
        villain2.useAbility();
        System.out.println();

        //create a Magician
        Villain villain3 = villainGenerator.getVillain("magician");
        System.out.println("Magician was created!");


        //call specialAbility method
        villain3.specialAbility();
        villain3.useAbility();

        System.out.println();

        //creates new Hero factory
        AbstractFactory heroGenerator= FactoryGenerator.factory("hero");

        //create a Cop
        Hero hero1 = heroGenerator.getHero("cop");
        System.out.println("Cop was created!");

        //call specialAbility method
        hero1.specialAbility();
        System.out.println();

        //create a Judge
        Hero hero2 = heroGenerator.getHero("judge");
        System.out.println("Judge was created!");

        //call specialAbility method
        hero2.specialAbility();
    }
}
