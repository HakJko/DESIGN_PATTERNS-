package edu.patterns.ik;

import edu.patterns.ik.factory.Developer;
import edu.patterns.ik.factory.ProjectManager;
import edu.patterns.ik.factory.ProjectTeamFactory;
import edu.patterns.ik.factory.Tester;
import edu.patterns.ik.factory.store.StoreTeamFactory;

public class SuperStoreSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new StoreTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating store system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
