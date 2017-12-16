package ChainOfResponsibilityPack;

public class LowLevelEmployee implements Chain {

   private Chain nextChain;

    @Override
    public void setNextChain(Chain higherLevel) {
        this.nextChain=higherLevel;
    }

    @Override
    public void solveTheProblem(String levelOfProblem) {
        if(levelOfProblem.compareTo("LowLevelEmployee")==0)
            System.out.println("Low Level Employee has solved the problem!");
        else
        {
            System.out.println("This problem is above Low Level Emplotee seniority. You are being transferred to the higher rank...");
            nextChain.solveTheProblem(levelOfProblem);
        }
    }
}
