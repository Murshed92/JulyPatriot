Feature:  Google  Search

Scenario Outline: simple search

Given I am on google homepage
When I enter the search "<term>"
And I click on the search button
Then I receive ralated search results


Examples:

|term               |
|Quality Assurance  |
|Software Testing   |
