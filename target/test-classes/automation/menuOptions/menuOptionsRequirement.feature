@tag
Feature: Cart

  @tag2
  Scenario: Add evening dress to cart
    Given open AutomationPractice
		And Find options named WOMEN and click on evening dress
		And Find Printed Dress and add to cart
		And Click on Continue shopping 
		And Click on cart and check items
		And Click on checkout and redirecting to cart page