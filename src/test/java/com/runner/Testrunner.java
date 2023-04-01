package com.runner;

import io.cucumber.core.plugin.HtmlFormatter;
import io.cucumber.core.plugin.PrettyFormatter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;
@CucumberOptions(features ="C:\\Users\\User\\eclipse-workspace\\cucumberProject\\src\\test\\resources\\features",glue = "com.steps",monochrome = true,snippets = SnippetType.CAMELCASE)
public class Testrunner extends AbstractTestNGCucumberTests {

}
