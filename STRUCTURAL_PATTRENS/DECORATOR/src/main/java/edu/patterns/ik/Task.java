package edu.patterns.ik;

public class Task {
    public static void main(String[] args) {
        IDeveloper simpleDeveloper = new JavaDeveloper();
        System.out.println("Simple developer = " + simpleDeveloper.makeJob());

        IDeveloper seniorDeveloper = new SeniorJavaDeveloper(new JavaDeveloper());
        System.out.println("Senior developer = " + seniorDeveloper.makeJob());

        IDeveloper teamLead = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println("Team lead = " + teamLead.makeJob());

    }
}
