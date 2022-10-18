package scripts;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	
	@Test
	public void tc1()  {
		
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsButton();
		s.skillraryDemoapp();

		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver);
		driverutilities.switchTabs(driver);
		driverutilities.mouseHover(driver,sd.getCoursetab());
		sd.selenium();
		
		AddtocartPage ad=new AddtocartPage(driver);
		driverutilities.doubleClick(driver,ad.getAddbtn());
        driverutilities.alertpopup(driver);
		
	}

}
