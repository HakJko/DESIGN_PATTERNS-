package edu.patterns.ik.factory.store;

import edu.patterns.ik.factory.Developer;
import edu.patterns.ik.factory.ProjectManager;
import edu.patterns.ik.factory.ProjectTeamFactory;
import edu.patterns.ik.factory.Tester;

public class StoreTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new StorePM();
    }
}
