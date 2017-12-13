package VisitorPack;

public interface Visitibale {
        // Because of method overloading it knows which method to use.

        public int accept(Visitor visitor);

    }

