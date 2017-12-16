package ChainOfResponsibilityPack;

/**
 * Created by Tal on 16/12/2017.
 */
public class Main {
    public static void main(String []args) {
        LowLevelEmployee emp1 = new LowLevelEmployee();
        MediumLevelEmployee emp2 = new MediumLevelEmployee();
        TeamLeader emp3 = new TeamLeader();
        CTO emp4 = new CTO();

        emp1.setNextChain(emp2);
        emp2.setNextChain(emp3);
        emp3.setNextChain(emp4);

        System.out.println("CTO problem: ");
        emp1.solveTheProblem("CTO");
        System.out.println("----------------------------------------");
        System.out.println("Low Level Employee problem: ");
        emp1.solveTheProblem("LowLevelEmployee");
        System.out.println("----------------------------------------");
        System.out.println("Team Leader problem: ");
        emp1.solveTheProblem("TeamLeader");
        System.out.println("----------------------------------------");
        System.out.println("World CEO problem: ");
        emp1.solveTheProblem("World CEO");
        System.out.println("----------------------------------------");

    }
}
