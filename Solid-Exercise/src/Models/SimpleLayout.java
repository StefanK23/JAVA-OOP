package Models;

import Loggers.Layout;

import javax.swing.*;

public class SimpleLayout implements Layout {

    @Override
    public String getLayout() {
        return "%s - %s - %s";
    }
}
