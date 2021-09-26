package edu.patterns.ik.factory.impl;

import edu.patterns.ik.factory.Developer;
import edu.patterns.ik.factory.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
