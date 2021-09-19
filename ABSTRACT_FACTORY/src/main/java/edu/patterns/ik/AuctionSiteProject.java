package edu.patterns.ik;

import edu.patterns.ik.factory.Developer;
import edu.patterns.ik.factory.ProjectManager;
import edu.patterns.ik.factory.ProjectTeamFactory;
import edu.patterns.ik.factory.Tester;
import edu.patterns.ik.factory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
