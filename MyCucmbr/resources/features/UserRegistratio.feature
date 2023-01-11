Feature: Verifying user Registration

		Scenario: Valid Registration
		Given Enter facebook site url
		 When user enter valid mobile number
		 And wait for OTP
		 And enter valid OTP
		 And Click on Create Account button
		 Then verify Registration sucessfull message displayed
		 
		 Scenario: 
		 Given Enter Facebook Site url
		 