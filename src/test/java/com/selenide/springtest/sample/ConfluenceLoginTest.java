package com.selenide.springtest.sample;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectDirectories;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;


@Suite
@IncludeEngines("cucumber")
@SelectDirectories("src\\test\\java\\com\\selenide\\springtest\\sample\\features\\conflence.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.selenide.springtest.sample")
@ConfigurationParameter(key = Constants.PLUGIN_PUBLISH_QUIET_PROPERTY_NAME, value = "true")
public class ConfluenceLoginTest {
}
