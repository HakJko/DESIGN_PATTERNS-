package edu.patterns.ik;

public class SeniorJavaDeveloper extends DeveloperDecorator{

    public SeniorJavaDeveloper(IDeveloper developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return " Make code review. ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
