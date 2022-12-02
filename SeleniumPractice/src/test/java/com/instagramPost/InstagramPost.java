package com.instagramPost;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramPost {

	public static void main(String args[]) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("userId");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password");

		driver.findElement(By.xpath("//div[.='Log in']")).click();

		driver.findElement(By.xpath("//div[.='Create']")).click();

		driver.findElement(By.xpath("//button[text()='Select from computer']")).click();

		Robot rb = new Robot();
		
		Thread.sleep(3000);
		
		rb.mouseMove(241, 315);
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		rb.mouseMove(376, 336);
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		rb.mouseMove(936, 609);
		rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

		driver.findElement(By.xpath(
				"(//div[@role='dialog']/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/button)[1]"))
				.click();

		driver.findElement(By.xpath("//div[.='Original']")).click();

		driver.findElement(By.xpath("//div[.='Next']")).click();

		driver.findElement(By.xpath("//div[.='Next']")).click();

		driver.findElement(By.xpath("//textarea[@aria-label='Write a caption...']")).sendKeys("(Follow and support)\r\n"
				+ "\r\n" + "Copyright Disclaimer:- The Following Image/Audio/ Video Is\r\n" + "\r\n"
				+ "Strictly Meant For Entertainment Purpose. All Credits Goes To Respective Owners. If You Have Any Problem With This Content Being Uploaded Please Contact For Removal. Will Rectify Immediately.");

		driver.findElement(By.xpath("//button[.='Share']")).click();

	}

}
