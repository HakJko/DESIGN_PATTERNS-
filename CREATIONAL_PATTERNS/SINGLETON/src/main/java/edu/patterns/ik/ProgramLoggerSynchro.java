package edu.patterns.ik;

public class ProgramLoggerSynchro {
    private static ProgramLoggerSynchro programLogger;
    private static String logFile = "This is log file. \n\n";

    public static synchronized ProgramLoggerSynchro getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLoggerSynchro();
        }
        return programLogger;
    }

    private ProgramLoggerSynchro() {}

    public void addLogInfo(String logInfo) {
        logFile += logInfo + '\n';
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
