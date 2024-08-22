package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					//features= {".//Features/"},
					//features= {".//Features/Login.feature"},
					//features= {".//Features/Registration.feature"},
		
					//features= {".//Features/LoginDDTExcel.feature"},
					features= {".//Features/Login.feature",".//Features/Registration.feature"},
					//features= {"@target/rerun.txt"},//run fail testcase
					glue={"stepDefinitions","hooks"},
					plugin= {
								"pretty", "html:reports/myreport.html", //This is cucumber report.(prettyis key and html:reports/myreport.html is value, html:reports/myreport.html specify the location and the name of report) 
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",//This is extent report, com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter is also another value of pretty keyword
								"rerun:target/rerun.txt",//This capture the fail scenarios
							
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server, if don't have it, the report only can see in local runtest machine
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {

}


