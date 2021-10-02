package edu.patterns.ik;

public class SprintRunner {
    public static void main(String[] args) {
        Job job = new Job();
        job.doJob();

        BugTracker bugTracker = new BugTracker();
        bugTracker.startSprint();

        Developer developer = new Developer();
        developer.doJobBeforeDeadline(bugTracker);

        bugTracker.finishSprint();

        developer.doJobBeforeDeadline(bugTracker);
    }
}
