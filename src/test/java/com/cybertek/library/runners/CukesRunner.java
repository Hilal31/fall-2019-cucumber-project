package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/recources/features",
        //to specify location of file use glue and paste from step definitions class
        glue = "com/cybertek/library/step_definitions",
        //
        dryRun = false,
        tags= "@wip" //we can use and, or, not and tags from feature file

)

public class CukesRunner {


}
