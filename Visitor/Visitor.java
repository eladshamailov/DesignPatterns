package VisitorPack;
//This pattern is used when you have to perform the same operation on objects of different types.

interface Visitor {

    public int visit(PremiumTeam premiumTeam);

    public int visit(MediumTeam mediumTeam);

    public int visit(SmallTeam smallTeam);

}
