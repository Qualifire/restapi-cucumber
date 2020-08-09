package com.example.www.restapicucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/versions",
        glue = "com.example.www.restapicucumber.bdd.stepdefs.version")
@SpringBootTest
public class StepDefIntegrationTest {
}
