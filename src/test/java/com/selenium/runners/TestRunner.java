package com.selenium.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features/BuySomethingPractice.feature"},
		glue = {"com.selenium.gluecode"}
		)
public class TestRunner {

}
