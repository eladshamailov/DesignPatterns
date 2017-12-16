package ChainOfResponsibilityPack;

public class TeamLeader implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain higherLevel) {
        this.nextChain=higherLevel;
    }

    @Override
    public void solveTheProblem(String levelOfProblem) {
        if(levelOfProblem.compareTo("TeamLeader")==0)
            System.out.println("Team Leader has solved the problem!");
        else
        {
            System.out.println("This problem is above Team Leader seniority. You are being transferred to the higher rank...");
            nextChain.solveTheProblem(levelOfProblem);
        }
    }
}
