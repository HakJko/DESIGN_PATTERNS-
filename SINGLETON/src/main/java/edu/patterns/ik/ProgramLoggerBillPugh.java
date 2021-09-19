package edu.patterns.ik;

public class ProgramLoggerBillPugh {

    private ProgramLoggerBillPugh() {

    }

    public static ProgramLoggerBillPugh getInstance() {
        return BillPughSingleton.INSTANCE;
    }


    private static class BillPughSingleton {
        private static final ProgramLoggerBillPugh INSTANCE = new ProgramLoggerBillPugh();
    }

}
