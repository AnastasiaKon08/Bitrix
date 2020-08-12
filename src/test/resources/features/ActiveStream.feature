@smoke
Feature: As a user, I should be able to send messages by clicking on Message tag under Active Stream.

Scenario: User should be able to click on upload files icon to upload files and pictures from local disks,
download from external drive, select documents from bixtrix24, and create files to upload.
  Given user is on landing page
  And user logs in as "hr"
  And user navigates to "Activity Stream"
  When user clicks on send message button
  And updates following file:
  |File path|src/test/resources/testData/testImage.png|
  Then user clicks on send button

