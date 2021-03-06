package ChainOfResponsibilityPack;

public class MediumLevelEmployee implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain higherLevel) {
        this.nextChain=higherLevel;
    }

    @Override
    public void solveTheProblem(String levelOfProblem) {
        if(levelOfProblem.compareTo("MediumLevelEmployee")==0)
            System.out.println("Medium Level Employee has solved the problem!");
        else
        {
            System.out.println("This problem is above Medium Level Employee seniority. You are being transferred to the higher rank...");
            nextChain.solveTheProblem(levelOfProblem);
        }
    }
}
