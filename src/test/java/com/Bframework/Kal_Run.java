package com.Bframework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Trupesh on 15/06/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty","json:target/json/output.json","html:target/html/"},
       tags = "@Krishna",
      features ="src/test/resources/com.BBC/cucumber_test.feature"
)
public class Kal_Run {
}
