@StackGetBasic
Feature: Testing different requests on the student application

@SMOKE
Scenario: Check if the details can be accessed by badge id
When User sends a GET request by badge id 3028 ,they must get back a valid status code 200
