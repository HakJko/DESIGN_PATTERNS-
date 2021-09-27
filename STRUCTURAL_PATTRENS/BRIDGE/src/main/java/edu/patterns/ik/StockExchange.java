package edu.patterns.ik;

public class StockExchange extends Program{

    protected StockExchange(Developer developer) {
        super(developer);
    }

    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
