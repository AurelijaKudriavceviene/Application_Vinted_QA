Vinted QA_Automation Project

This repository contains a sample Java project demonstrating UI automation testing for the Vinted website (www.vinted.lt). It uses Selenium WebDriver for browser automation and JUnit for test execution.

The main test case performs the following actions:
1.Navigates to the Vinted homepage.
2.Clicks on the "About" link and then the "Karjera" (Careers) link to reach the Careers page.
3.Clicks on the "Jobs" link to navigate to the Careers Jobs page.
4.Enters "Junior Quality Assurance" in the job title search field.
5.Asserts that the search results contain at least one job title that includes "Junior Quality Assurance".

Dependencies:
1.Selenium WebDriver
2.JUnit

How to Run:
1.Clone the repository.
2.Make sure you have the necessary dependencies installed.
3.Run the tests using your preferred JUnit runner.
Note: The project currently uses ChromeDriver. You may need to adjust the driver instantiation in BaseTest.java if you want to use a different browser.
