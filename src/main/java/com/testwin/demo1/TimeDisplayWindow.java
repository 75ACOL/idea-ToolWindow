package com.testwin.demo1;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

public class TimeDisplayWindow {
    private JPanel rootPanel;
    private JTextPane hellowordTextPane;
    public TimeDisplayWindow(ToolWindow toolWindow){

    }
    public JPanel getContent(){
        return rootPanel;
    }
}
