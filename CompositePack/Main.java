package CompositePack;

public class Main {
        public static void main (String[] args)
        {
            BootcampSoldier sol1 = new BootcampSoldier(5423261, "Tal Baum", "November 2010");
            BootcampSoldier sol2 = new BootcampSoldier(6487622, "Elad Shamailov", "December 2010");
            Pikud pikudDarom = new Pikud();
            pikudDarom.recruitSoldier(sol1);
            pikudDarom.recruitSoldier(sol2);

            Commander commander1 = new Commander(1113332, "Benny Gantz", "July 1978");
            Commander commander2 = new Commander(1237892, "Gadi Eizenkot ", "March 1982");

            Pikud pikudMerkaz = new Pikud();
            pikudMerkaz.recruitSoldier(commander1);
            pikudMerkaz.recruitSoldier(commander2);

            Pikud all = new Pikud();
            all.recruitSoldier(pikudDarom);
            all.recruitSoldier(pikudMerkaz);
            System.out.println("Print all the Soldiers details:");
            all.printSoldierDetails();
            System.out.println("----------------------------------------------");
            System.out.println("Inesrt a soldier into the prison:");
            all.insertToJail(sol2);
            System.out.println("----------------------------------------------");
            all.dissmissSoldier(sol1);

        }



}
