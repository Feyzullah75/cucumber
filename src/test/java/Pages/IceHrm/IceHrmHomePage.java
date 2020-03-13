package Pages.IceHrm;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IceHrmHomePage {

    public IceHrmHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//span[.='Admin']")
    public WebElement adminButton;

    @FindBy(xpath = "//ul[@id='admin_Admin']//li")
    public List<WebElement> adminHeaders;

    @FindBy(xpath = "//span[.='Personal Information']")
    public WebElement personalInfo;

    @FindBy(xpath = "//ul[@id='module_Personal_Information']//li")
    public List<WebElement> personalInfoList;

    @FindBy(xpath = "//i[@class='fa fa-check-square']")
    public WebElement qualificationButton;
    @FindBy(id = "tabEducation")
    public WebElement educationButton;

    @FindBy(xpath = "//div[@id='tabPageEducation']//td[1]")
    public List<WebElement> personalInfoNames;

    @FindBy(xpath = "//div[@id='tabPageEducation']//td[2]")
    public List<WebElement> personalInfoValues;

    @FindBy(xpath = "(//a[@href=\"http://icehrm-open.gamonoid.com/?g=admin&n=projects&m=admin_Admin\"])[2]")
    public WebElement projectsClientSetupButton;

    /*
    Create one method will take two parameter as a list of keys and values
    This method will return map<k, v>
     */
    @FindBy(xpath = "//*[@id=\"grid\"]/tbody/tr[1]")
    public List<WebElement> names;
@FindBy(xpath = "//*[@id=\"grid\"]/tbody/tr[3]")
public List<WebElement> adresses;
    @FindBy(xpath = "//*[@id=\"grid\"]/tbody/tr[4]")
    public List<WebElement> contactNumbers;
    public Map<String, String> getQualificationInfo(List<WebElement> keys, List<WebElement> values){

        Map<String, String> allInfo=new HashMap<>();
        for (int i=0; i<keys.size(); i++){
            allInfo.put(keys.get(i).getText(), values.get(i).getText());
        }
        return allInfo;
    }



}
