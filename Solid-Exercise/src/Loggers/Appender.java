package Loggers;

import enums.ReportLevel;

public interface Appender {
    void appendMessage(String dataTime, ReportLevel reportLevel, String message);
}
