package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageBase.PageBase;
import Pages.EndPage;
import Pages.HomePage;
import Pages.MoviesPage;
import Pages.Signin;
import Pages.SportsPage;



public class TestCase {

	
	HomePage homePage;
	SportsPage sportsPage;
	MoviesPage moviesPage;
	Signin signin;
	EndPage endpage;
	
	@Test
	public void SportsActivities(){
	PageBase pageBase = new PageBase();
	pageBase.invokeBrowser("chrome");
	homePage = pageBase.openURL();
	
	 sportsPage = homePage.click();
	 moviesPage = sportsPage.SportsActivies();
	 signin = moviesPage.getMovieNames();
	 endpage= signin.UserSignin();	  
	}	
	}

