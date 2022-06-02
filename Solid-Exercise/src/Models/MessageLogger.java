package Models;

import Loggers.Appender;
import Loggers.Logger;
import enums.ReportLevel;

public class MessageLogger implements Logger {
    private Appender[] appenders;

    public MessageLogger(Appender... appenders) {
        this.appenders = appenders;
    }

    @Override
    public void logInfo(String dataTime, String message) {
        this.logMessage(dataTime,ReportLevel.INFO ,message);
    }

    @Override
    public void logWarning(String dataTime, String message) {
        this.logMessage(dataTime,ReportLevel.WARNING ,message);
    }

    @Override
    public void logError(String dataTime, String message) {
        this.logMessage(dataTime,ReportLevel.ERROR ,message);
    }

    @Override
    public void logCritical(String dataTime, String message) {
        this.logMessage(dataTime,ReportLevel.CRITICAL ,message);
    }

    @Override
    public void logFatal(String dataTime, String message) {
        this.logMessage(dataTime,ReportLevel.FATAL ,message);
    }
    private void logMessage(String dataTime, ReportLevel reportLevel, String message ) {
        for (Appender appender   : appenders) {
            appender.appendMessage(dataTime,reportLevel,message);
        }
    }
}
