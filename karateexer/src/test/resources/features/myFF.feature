#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Getting an existing book and adding another book into the book store
  Karate Based Get and Post API calls
  
Background:
    * callonce read("random.feature")
    
  @TrainingFunctionCalls
  Scenario: Call JavaScript function defined in another feature file
  #* def value = call greeter {first: "John", last: "Doe"}
  #* print value
  * def sumHere = call sum 10, 20
  * print sumHere
    

  @WIPMatchers
  Scenario: Getting all the existing books
    Given url 'https://demoqa.com/BookStore/v1'
    And path 'Books'
    When method get
    Then status 200
    * print response
    * match response.books[0].isbn == '#notnull'
    * match response.books[0].isbn == '#present'
    * match response.books[0].isbn == '#number'
    * assert response.books[0].isbn == 9781449325862
    * match response.books[0].isbn contains only [9781449325862]
    * match response.books[0].isbn contains any [9781449325862, 9781449325845, 9781449325567, 9781449325234]
    * match response.books[0].title == '#string'
    * match response.books[0].title == 'Git Pocket Guide'
    * match response.books[0].title contains 'Git Pocket Guide'
    * match response.books[0].title contains '#regex .*Git Pocket.*'
    * match response.books[0].title !contains 'Karate Trainings'
    
    # match is preferbale to use, in place of assert, variety of validations
      
  @WIP
  Scenario: Use of SET keyword
   
  * def myJson = { foo: 'bar' }
  * set myJson.foo = 'world'
  #* set myJson.petnames[0].first= 'sandeep'
  * match myJson == { foo: 'world' }
  #* match myJson == { foo: 'world', petnames: [{first : 'rahul', last : 'jaiswal'}, {first : 'rohit', last : 'jaiswal'} ] }
    
  @Training
  Scenario: Generating authorization Token post request
  * def user = karate.read('classpath:reqPayload.json')
  #* def user =
   #	 	"userName": "TOOLSQA-Test",
  	#		"password": "Test@@123"
			#}
      #"""
    Given url 'https://bookstore.toolsqa.com'
    And path '/Account/v1/GenerateToken'
    And request user
    When method post 
    Then status 200
    
    
   @TestCurrent
  Scenario: Use the value returned from another feature file
  * def result = call read("classpath:/features/ff1.feature")
  * def token =  result.response.token
   Given url apiSrvrURL
   * print apiSrvrURL
    And path 'Books'
    And header 'authorization' = token
    When method get
    Then status 200
    * print response
  
  @TestJsonPass
  Scenario: Pass Json to another feature file
  * def fetchToken = call read('classpath:/features/authorize.feature') { username: 'TOOLSQA-Test', password: 'Test@@123' }
  #* print fetchToken
  
  @TestJavaCall
   Scenario: Using a Java class methods in scenario
   * def classJava =  Java.type('misc.TestMisc')
   * def res= new classJava().meth("World")
   #* print 'sum of nums is-- ', res
   * print 'Value Returned is-- ', res
  
  
  
  