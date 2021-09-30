package edu.patterns.ik;

public class DeveloperDecorator implements IDeveloper{

    IDeveloper developer;

    public DeveloperDecorator(IDeveloper developer) {
        this.developer = developer;
    }

    public String makeJob() {
        return developer.makeJob();
    }
}
