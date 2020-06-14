package JC1.Homework.Homework8.logs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class MyLogger {

    /**
     * NOTE! Нет модификаторов доступа
     */
    // поправил
    private File logFile;
    private Date date;
    private LoggerNote loggerNote;

    public MyLogger(String loggerFilePath) {
        logFile = new File(loggerFilePath);
    }

    public void writeLog(String loggerText) {
        date = new Date();
        loggerNote = new LoggerNote(date, loggerText);
        MyLogger.this.writeLogInFile(loggerNote);
    }

    public void writeLog(String loggerText, String fileName) {
        date = new Date();
        loggerNote = new LoggerNote(date, loggerText, fileName);
        MyLogger.this.writeLogInFile(loggerNote);
    }

    private void writeLogInFile(LoggerNote loggerNote) {
        try (FileWriter fileWriter = new FileWriter(logFile, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(loggerNote.getLoggerNote());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
