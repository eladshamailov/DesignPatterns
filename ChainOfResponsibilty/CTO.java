package ChainOfResponsibilityPack;

public class CTO implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain higherLevel) {
        this.nextChain=higherLevel;
    }

    @Override
    public void solveTheProblem(String levelOfProblem) {
        if(levelOfProblem.compareTo("CTO")==0)
            System.out.println("CTO has solved the problem!");
        else
            System.out.println("This problem is above CTO seniority. Find the solution yourself.");

    }
}

