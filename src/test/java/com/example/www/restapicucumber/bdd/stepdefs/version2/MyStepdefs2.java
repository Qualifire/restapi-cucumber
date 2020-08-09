package com.example.www.restapicucumber.bdd.stepdefs.version2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs2 {

    @Then("the client2 receives status code{int} of {int}")
    public void theClientReceivesStatusCodeOf(int arg0, int arg1) {
        System.out.println("RECEIVING HTTP STATUS CODE2");
    }

    @And("the client receives server version{int} {double}")
    public void theClientReceivesServerVersion(int arg0, int arg1, int arg2) {
        System.out.println("ASSERTING2");
    }

    @When("the client{int} calls \\/version")
    public void theClientCallsVersion(int arg0) {
        System.out.println("GETTING2");

    }
}
