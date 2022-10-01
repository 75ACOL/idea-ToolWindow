package com.testwin.demo1;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;

/**
* 日期显示窗口工厂
*
* @author 鱼蛮 Date 2022/6/18
*/
public class TimeDisplayWindowFactory implements ToolWindowFactory {
    
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        TimeDisplayWindow timeDisplayWindow = new TimeDisplayWindow(toolWindow);
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(timeDisplayWindow.getContent(), "", false);
        toolWindow.getContentManager().addContent(content);
    }
}