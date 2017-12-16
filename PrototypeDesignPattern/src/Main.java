public class Main {
    /*
    We create a magicin, sniper and warrior. We want to clone them and get the same id's and content , while 
    each one of them will be stored in his own memory location.
    */

    public static void main(String[]args){
        //creates CloneFactory
        CloneFactory cloneFactory = new CloneFactory();
        //Creates Magician
        Magician magician1 = new Magician();
        //Creates Sniper
        Sniper sniper1 = new Sniper();
        //Creates Warrior
        Warrior warrior1 = new Warrior();

        //creates clone
        Magician magician2 = (Magician) cloneFactory.getVillain(magician1);
        Sniper sniper2 = (Sniper) cloneFactory.getVillain(sniper1);
        Warrior warrior2 = (Warrior) cloneFactory.getVillain(warrior1);
        /*
        clones have the same content and stored in their own memory location,
        hence have a different hashCode
         */
        System.out.println("magician id: "+magician1.getId() +" clone id: "+magician2.getId());
        System.out.println("magician hashCode: "+magician1.getHashCode() +" clone hashCode: "+magician2.getHashCode());
        System.out.println("sniper id: "+sniper1.getId() +" clone id: "+sniper2.getId());
        System.out.println("sniper hashCode: "+sniper1.getHashCode() +" clone hashCode: "+sniper2.getHashCode());
        System.out.println("warrior id: "+warrior1.getId() +" clone id: "+warrior2.getId());
        System.out.println("warrior hashCode: "+warrior1.getHashCode() +" clone hashCode: "+warrior2.getHashCode());
    }

}
