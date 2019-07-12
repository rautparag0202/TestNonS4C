Feature: Application login
Scenario: Launch application
Given Launch application1
When enter username as "<x>"
And enter password as "<y>"
Then click on login button
Examples:
|x                      ||y        |
|TREASURY_SPECIALIST_BOE||Welcome1!|