package edu.patterns.ik.factory.website;

import edu.patterns.ik.factory.Developer;
import edu.patterns.ik.factory.ProjectManager;
import edu.patterns.ik.factory.ProjectTeamFactory;
import edu.patterns.ik.factory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public Tester getTester() {
        return new ManualTester();
    }

    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
