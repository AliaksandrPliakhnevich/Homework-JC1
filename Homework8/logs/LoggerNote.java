package JC1.Homework.Homework8.logs;

import java.util.Date;

public class LoggerNote {

    private final String loggerNote;

    public LoggerNote(Date date, String loggerText) {
        this.loggerNote = String.format("[%tT] - %s%n", date, loggerText);
    }

    public LoggerNote(Date date, String loggerText, String fileName) {
        this.loggerNote = String.format("[%tT] - %s %s%n", date, loggerText, fileName);
    }

    public String getLoggerNote() {
        return loggerNote;
    }
}
