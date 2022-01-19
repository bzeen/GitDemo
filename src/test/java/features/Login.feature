Feature: Application Login

Scenario: Home page default login
Given user is on NetBanking landing page
When user login into applciation using "abc" and "1234"
Then home page is populated
And cards are displayed
And users name is displayed at the top right
And users picture is displayed