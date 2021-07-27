Feature: Buliding cucumber framework for lumens Website 



Scenario: User able to create a account in lumens 
	Given launch the browser and go to url 
	When Mouse over to account and click My Account 
	Then Enter the given details to create account 
	
Scenario: user is able to Login Lumens  application 
	Given launch the browser and go to url 
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	
Scenario: user is able to view  the added product in the cart 
	Given launch the browser and go to url 
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	And Mouseover on lightenings and select the product 
	Then add the product to the cart 
	And user is able to view the cart 
	
	
Scenario: verify zipCode 
	Given launch the browser and go to url 
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	And Mouseover on lightenings and select the product 
	Then add the product to the cart 
	And user is able to view the cart 
	Then enter the zipCode 
	
	
Scenario: User able to increase the quantity of the product 
	Given launch the browser and go to url 
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	Then select the product and increase the quantity of the product
	
	
Scenario: Logout 
	Given launch the browser and go to url 
	When Mouse over to account and click sign In button 
	Then Enter the valid credentials 
	Then user click on signout btn and able to signout 
	
	
	
	    