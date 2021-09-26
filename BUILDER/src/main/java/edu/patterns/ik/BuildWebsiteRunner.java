package edu.patterns.ik;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();
        VisitCardWebsiteBuilder visitCard = new VisitCardWebsiteBuilder();

        director.setBuilder(visitCard);
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
