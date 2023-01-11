Feature: Verify Flipkart Registration
	Scenario: Registration with mobile number
		Given site url as "http://flipkart.com"
		And click on Register with us
		When user enter valid mobilenumber "9177379095"
		And Enter firstname as "Rishik"
		And Enter Surname as "Rudra"
		And Enter age as 22
		And click on Register
		Then verify Sucessful message