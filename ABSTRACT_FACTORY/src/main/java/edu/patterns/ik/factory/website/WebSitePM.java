package edu.patterns.ik.factory.website;

import edu.patterns.ik.factory.ProjectManager;

public class WebSitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Web Site PM manages website project...");
    }
}
