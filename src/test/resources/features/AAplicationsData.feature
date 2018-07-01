@csvReportDataValidation
Feature: Applicants data csv report

Background:
	Given User is on Applicants report page
	
Scenario: Validate UI data agains CSV report
	Given csv report is generated
	Then data in ui and csv report should match