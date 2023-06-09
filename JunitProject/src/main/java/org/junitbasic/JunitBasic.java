package org.junitbasic;

import java.util.*;

import javax.annotation.Tainted;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.Pom_getters_setters;

public class JunitBasic extends BaseClass {
	
	@BeforeClass
	public static void tc1() {
		
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	
	public static void tc2() {

		//closeEntireBrowser();
	}
	
	
	@Before
	public void tc3() {

		Date day = new Date();
		
		System.out.println(day);
	}

	@After
	public void tc4() {

		Date day = new Date();
		
		System.out.println(day);
	}
	
	@Test
	
	public void tc5() {
		System.out.println("Test Case FB: ");
		launchBrowser();
		
		launchUrl("https://www.facebook.com/");
		String title	= pageTitle();
		
		String url = pageUrl();
		
		Pom_getters_setters f = new Pom_getters_setters();
		
		
		passText("Prasanth", f.getEmail());
	}
	@Test
	public void tc6() {
		System.out.println("Test Case Gmail: ");
		
		launchUrl("https://mail.google.com/mail/u/0/#inbox");
		
	
	
	}
	@Test
	public void tc7() {
		System.out.println("Test Case Inmakes: ");
		
		launchUrl("https://lh.inmakesedu.com/home/login");
	}
	@Test
	public void tc8() {
		System.out.println("Test Case Youtube: ");
		
		launchUrl("https://www.youtube.com/");
	}
}
