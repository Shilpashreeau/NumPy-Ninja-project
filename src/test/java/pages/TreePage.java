package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreePage {
	public WebDriver driver;
	WebDriverWait wait;
	public TreePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='tree']")
	WebElement getStartedTree;
	@FindBy(xpath="//div/h4[text()='Tree']")
	WebElement TreeTitle;
	@FindBy(xpath="//div/ul/a[text()='Overview of Trees']")
	WebElement TreeOverview;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement OverviewTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Terminologies']")
	WebElement Terminologies;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement TerminologiesTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Types of Trees']")
	WebElement Treetypes;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement TreetypesTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Tree Traversals']")
	WebElement Treetraversal;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement TreetraversalTryHere;
	

	@FindBy(xpath="//div/ul/a[text()='Binary Trees']")
	WebElement BinaryTree;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement BinarytreeTryHere;
	
	@FindBy(xpath="//div/ul/a[text()='Binary Search Trees']")
	WebElement BinarySearchTree;
	@FindBy(xpath="//a[@class='btn btn-info']")
	WebElement BinarySearchtreeTryHere;
	
	public void getStartedTreeFunction() {
		getStartedTree.click();
	}
	public void treeTitleDisplay() {
		TreeTitle.isDisplayed();
	}
	public void treeOverview() {
		TreeOverview.click();
		
	}
	public void  treeOverviewTRyhere() {
		OverviewTryHere.isDisplayed();
	}
	public void  treeOverviewTRyhereClick() {
		OverviewTryHere.click();
	}
	
	public void terminologiesFunction() {
		Terminologies.click();
		
	}
	public void  terminologiesTRyhere() {
		OverviewTryHere.isDisplayed();
	}
	public void  terminologiesTRyhereClick() {
		OverviewTryHere.click();
	}
	
	public void typesOfTreesFunction() {
		Treetypes.click();
		
	}
	public void  treetypesTRyhere() {
		TreetypesTryHere.isDisplayed();
	}
	public void  treeTypesTRyhereClick() {
		TreetypesTryHere.click();
	}
	
	public void treeTraversalFunction() {
		Treetraversal.click();
		
	}
	public void  treeTraversalsTRyhere() {
		TreetraversalTryHere.isDisplayed();
	}
	public void  treeTraversalTRyhereClick() {
		TreetraversalTryHere.click();
	}
	
	public void binaryTreeFunction() {
		BinaryTree.click();
		
	}
	public void  binaryTreesTRyhere() {
		BinarytreeTryHere.isDisplayed();
	}
	public void  binaryTreeTRyhereClick() {
		BinarytreeTryHere.click();
	}
	
	public void binarySearchTreeFunction() {
		BinarySearchTree.click();
		
	}
	public void  binarySearchTreesTRyhere() {
		BinarySearchtreeTryHere.isDisplayed();
	}
	public void  binarySearchTreeTRyhereClick() {
		BinarySearchtreeTryHere.click();
	}


}
