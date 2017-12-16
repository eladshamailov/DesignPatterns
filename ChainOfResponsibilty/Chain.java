package ChainOfResponsibilityPack;

public interface Chain {
    public void setNextChain(Chain higherLevel);
    public void solveTheProblem(String levelOfProblem);

}
