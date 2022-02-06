Feature: User Registration
i want to cheak that the user can registar in our e-commerce website
Scenario Outline: User Registration
Given the user in home page
When i click on registar link 
And i entered "<fname>","<lname>","<email>","<password>"
Then The registration page displayed 
 Examples:
 | fname | lname | email| password |
 | mazen | hassan | mazen2274@gmail.com |123456|
 | mohab | hassan | mmohab2274@gmail.com |123456|
 