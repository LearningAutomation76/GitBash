package TestLayer;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import UtilsLayer.HandleWindowMethods;

public class Demo1 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
	
		BaseClass.initialization();
		Thread.sleep(5000); 
			
		driver.findElement(By.partialLinkText("HRM")).click(); 
			
		Set<String> ls = driver.getWindowHandles(); 
			
		ArrayList<String> arr = HandleWindowMethods.handleWindows(ls); 
 
			
		String a = arr.get(1); 
			
		driver.switchTo().window(a); 
			
		System.out.println(driver.getCurrentUrl()); 
 
} 
 
 

	}


