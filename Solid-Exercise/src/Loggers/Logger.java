package Loggers;

public interface Logger {

    void logInfo(String dataTime, String message);

    void logWarning(String dataTime, String message);

    void logError(String dataTime, String message);

    void logCritical(String dataTime, String message);

    void logFatal(String dataTime, String message);
}
