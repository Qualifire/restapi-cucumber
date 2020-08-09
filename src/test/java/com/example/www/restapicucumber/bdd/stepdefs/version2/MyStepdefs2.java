package com.example.www.restapicucumber.bdd.stepdefs.version2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs2 {

    @Then("the client receives status code{int} of {int}")
    public void theClientReceivesStatusCodeOf(int arg0, int arg1) {
        System.out.println("RECEIVING HTTP STATUS CODE2");
    }

    @And("the client receives server version{int} {int}")
    public void theClientReceivesServerVersion(int arg0, int arg1) {
        System.out.println("ASSERTING2");
    }

    @When("the secondclient calls")
    public void theSecondclientCalls() {
        System.out.println("GETTING2");
    }
}
