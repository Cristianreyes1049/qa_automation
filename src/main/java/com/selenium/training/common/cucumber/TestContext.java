package com.selenium.training.common.cucumber;

import com.selenium.training.common.manager.DriverManager;
import com.selenium.training.common.manager.PageManager;

public class TestContext {
    private DriverManager driverManager;
    private PageManager pageManager;

    public TestContext(){
        driverManager = new DriverManager();
        pageManager = new PageManager(driverManager.getDriver());
    }

    public DriverManager getDriverManager() {
        return driverManager;
    }

    public PageManager getPageManager() {
        return pageManager;
    }
}
