package edu.patterns.ik;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(IDeveloper developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
