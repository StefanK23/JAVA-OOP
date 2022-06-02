package Models;

import Loggers.Appender;
import Loggers.Layout;
import enums.ReportLevel;

public class ConsoleAppender implements Appender {
    private Layout layout;


    public ConsoleAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public void appendMessage(String dataTime, ReportLevel reportLevel, String message) {
        System.out.println (String.format(layout.getLayout(), dataTime, reportLevel.toString(),message));

    }
}
