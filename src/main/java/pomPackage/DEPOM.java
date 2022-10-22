package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DEPOM {
	WebDriver driver;
	WebDriverWait wait;

	// Log In
	@FindBy(xpath = "//input[@autocomplete='email']")
	private WebElement Email;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SignIn;

	// Create New Project
	@FindBy(xpath = "//span[normalize-space()='Create new project']")
	private WebElement CreateNewProject;

	@FindBy(xpath = "//input[@class='mat-input-element mat-form-field-autofill-control ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-star-inserted ng-touched']")
	private WebElement ProjectName;

	@FindBy(xpath = "//span[.='Save']")
	private WebElement ProjectSaveButton;

	@FindBy(xpath = "//span[text()=' Skip this step ']")
	private WebElement SkipThisStep;

	// Upload A Construction Doc
	@FindBy(xpath = "//a[text()='plans']")
	private WebElement Plans;

	@FindBy(xpath = "//span[text()='upload from your computer']")
	private WebElement Upload;

	@FindBy(xpath = "//span[text()=' Skip auto naming ']")
	private WebElement SkipAutoNaming;

	// Add Finish Area
	@FindBy(xpath = "//a[text()='schedules']")
	private WebElement Schedules;

	@FindBy(xpath = "//a[text()='rooms']")
	private WebElement Rooms;

	@FindBy(xpath = "(//span[text()=' Create new room '])[2]")
	private WebElement CreateNewRoom;

	@FindBy(xpath = "(//button[@class='mat-focus-indicator mat-menu-item ng-star-inserted'])[3]")
	private WebElement KDL;

	@FindBy(xpath = "(//div[text()=' Kitchen '])[2]")
	private WebElement Kitchen;

	@FindBy(xpath = "(//div[text()=' Kitchen - Vestibule '])[2]")
	private WebElement KitchenVestibule;

	@FindBy(xpath = "(//span[text()=' Save '])[2]")
	private WebElement KitechenSave;

	@FindBy(xpath = "(//span[text()=' Add finish area '])[1]")
	private WebElement AddFinishArea;

	@FindBy(xpath = "//button[text()=' Floor ']")
	private WebElement Floor;

	// Open Catalog Window
	@FindBy(xpath = "//div[text()=' Finish Item ']")
	private WebElement FinishItem;

	@FindBy(xpath = "//span[text()=' Create new project finish ']")
	private WebElement CreateNewProjectFinsh;

	@FindBy(xpath = "//button[text()=' Wood Flooring ']")
	private WebElement WoodFlooring;

	@FindBy(xpath = "//div[text()=' Select an item ']")
	private WebElement SelectAnItemFromCatalog;

	// Project Finish
	@FindBy(xpath = "(//mat-icon[text()='arrow_drop_down'])[3]")
	private WebElement Type;

	@FindBy(xpath = "//div[text()='Wood']")
	private WebElement Wood;

	@FindBy(xpath = "//span[text()=' View all items ']")
	private WebElement ViewAllItems;

	@FindBy(xpath = "(//span[text()=' Add to project '])[1]")
	private WebElement AddToProject;

	@FindBy(xpath = "//div[text()='Assign to finish area']")
	private WebElement AssignToFinishArea;

	public DEPOM(WebDriver driver) // constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	// methods
	public void logIn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@autocomplete='email']")));

		Email.sendKeys("prasadnidhane17@gmail.com");
		Password.sendKeys("Prasadnpn@1710");
		SignIn.click();

	}

	public void createNewProject() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Create new project']")));
		CreateNewProject.click();
		Thread.sleep(5000);	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Cancel']")));
		Actions act= new Actions(driver);
		act.moveToElement(CreateNewProject).click().perform();
		
		ProjectName.sendKeys("123");
		ProjectSaveButton.click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Skip this step ']")));
		SkipThisStep.click();
		
	}

	public void uploadAConstructionDoc() throws IOException, InterruptedException {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='plans']")));
		Plans.click();
		Thread.sleep(5000);
	
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='upload from your computer']")));
		Upload.click();
		Thread.sleep(5000);
		

		Runtime.getRuntime().exec("AutoIT\\DE.exe" + " " + "D:\\AutoIT\\Sample.pdf");
       
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Skip auto naming ']")));
		SkipAutoNaming.click();
	}

	public void addFinishArea() {

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='schedules']")));
		Schedules.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='rooms']")));
		Rooms.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Create new room '])[2]")));
		CreateNewRoom.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='mat-focus-indicator mat-menu-item ng-star-inserted'])[3]")));
		KDL.click();
        
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()=' Kitchen '])[2]")));
		Kitchen.click();
		
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()=' Kitchen - Vestibule '])[2]")));
		KitchenVestibule.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Save '])[2]")));
		KitechenSave.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Add finish area ']")));
		AddFinishArea.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Floor ']")));
	    Floor.click();
	}

	public void openCatalogWindow() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Finish Item ']")));
		FinishItem.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Create new project finish ']")));
		CreateNewProjectFinsh.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Wood Flooring ']")));
		WoodFlooring.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()=' Select an item ']")));
		SelectAnItemFromCatalog.click();
	}

	public void projectFinish() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-icon[text()='arrow_drop_down'])[3]")));
		Type.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Wood']")));
		Wood.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' View all items ']")));
		ViewAllItems.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()=' Add to project '])[1]")));
		Actions act=new Actions(driver);
		act.moveToElement(AddToProject).click().build().perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Assign to finish area']")));
		AssignToFinishArea.click();
	}

}
