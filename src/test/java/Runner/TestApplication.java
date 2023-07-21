package Runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ExtentManager;
import utilities.ExtentTestManager;

@CucumberOptions(features ={
	//	"src/test/java/iisParamsFeatures/ImalLogIn.feature",
		"src/test/java/iisParamsFeatures/ChargesTest.feature",
	//	"src/test/java/iisParamsFeatures/ChargesM008.feature",
	//	"src/test/java/iisParamsFeatures/ProductTypeM030.feature",
	//	"src/test/java/iisParamsFeatures/BoardMembers.feature",
		"src/test/java/iisParamsFeatures/Deviation.feature",
		"src/test/java/iisParamsFeatures/InsuranceCompany.feature",
		"src/test/java/iisParamsFeatures/InsuranceType.feature",
		//"src/test/java/iisParamsFeatures/LeasedAsset.feature",
	//	"src/test/java/iisParamsFeatures/SettlementPolicy.feature",
		"src/test/java/iisParamsFeatures/TargetMaintenanceM04MT.feature",
		"src/test/java/iisParamsFeatures/VendorInformation.feature",
		"src/test/java/iisParamsFeatures/YeildRoster.feature",
		//"src/test/java/iisParamsFeatures/YieldRegister.feature",
		//"src/test/java/iisParamsFeatures/TargetMaintenanceM04MT.feature",
		},

		glue = "iisParamsStepdefinitions",
		// monochrome=false,
		plugin = { "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:ReRu nScenarios/FailedReRun.txt" }
// dryRun = false
//, tags = "@KUBS_FAT_UAT_002_003_01_Transfer_Undertaking"
)
public class TestApplication extends AbstractTestNGCucumberTests {
	@BeforeSuite
	public void beforeExecution() {
		System.out.println("*** Test Execution started ***");
	}

	@AfterSuite
	public void afterExecution() {
		System.out.println("*** Test Execution Finished ***");
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}
}