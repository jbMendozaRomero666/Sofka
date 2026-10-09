Feature: PetStore User CRUD Operations

  Background:
    * def baseUrl = 'https://petstore.swagger.io/v2'
    * def common = read('classpath:util/common.js')
    * def timestamp = java.lang.System.currentTimeMillis()
    * def username = 'testuser_' + timestamp
    * def email = 'testuser_' + timestamp + '@example.com'
    * def password = 'password123'
    * def phone = '1234567890'

  Scenario: Create, get, update, get and delete a user
    # 1. Create a user
    Given url baseUrl
    And path 'user'
    And request
    """
    {
      "id": 0,
      "username": "#(username)",
      "firstName": "Test",
      "lastName": "User",
      "email": "#(email)",
      "password": "#(password)",
      "phone": "#(phone)",
      "userStatus": 1
    }
    """
    When method POST
    Then status 200
    And print 'CREATED USER:', username
    And match response.code == 200
    And match response.message == '#string'

    # 2. Get the created user
    Given url baseUrl
    And path 'user', username
    When method GET
    Then status 200
    And print 'GET USER RESPONSE:', response
    And match response.username == username
    And match response.email == email
    * def userId = response.id

    # 3. Update user name and email
    * def newEmail = 'updated_' + timestamp + '@example.com'
    * def updatedFirstName = 'UpdatedName'
    Given url baseUrl
    And path 'user', username
    And request
    """
    {
      "id": #(userId),
      "username": "#(username)",
      "firstName": "#(updatedFirstName)",
      "lastName": "User",
      "email": "#(newEmail)",
      "password": "#(password)",
      "phone": "#(phone)",
      "userStatus": 1
    }
    """
    When method PUT
    Then status 200
    And print 'UPDATED USER:', username

    # 4. Get the updated user
    Given url baseUrl
    And path 'user', username
    When method GET
    Then status 200
    And print 'GET UPDATED USER RESPONSE:', response
    And match response.username == username
    And match response.firstName == updatedFirstName
    And match response.email == newEmail

    # 5. Delete the user
    Given url baseUrl
    And path 'user', username
    When method DELETE
    Then status 200
    And print 'DELETED USER:', username