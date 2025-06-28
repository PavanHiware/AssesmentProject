Feature: Page performance

@performance
Scenario: Page load performance-Login Element

Given User is on given URL 
And Start timer after initial page load
When Wait for visibility of element
And Stop timer once elements are visiable
Then Log total time taken