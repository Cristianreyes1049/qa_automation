package com.selenium.training.common.manager;

import com.selenium.training.common.dataProvider.ConfigFileReader;
import com.selenium.training.common.dataProvider.JsonReader;

public class ReaderManager {

    private static ReaderManager readerManager = new ReaderManager();
    private static ConfigFileReader configFileReader;
    private static JsonReader jsonReader;

    private ReaderManager() {
    }

    public static ReaderManager getInstance( ) {
        return readerManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }

    public JsonReader getJsonReader(){
        return (jsonReader == null) ? new JsonReader() : jsonReader;
    }
}
