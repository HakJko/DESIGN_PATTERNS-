package edu.patterns.ik.factory.impl;

import edu.patterns.ik.factory.Developer;

public class PhpDeveloper implements Developer {
    public void writesCode() {
        System.out.println("Php developer writes PHP code...");
    }
}
