

#Sample data

#Current Age 	40
#Retirement Age 	68
#Current annual income 	$100000
#Spouse’s annual income 	$75000
#Current retirement savings 	$500000
#Current retirement contribution 	10%
#Annual retirement contribution increase 	.25%
#Social Security Income 	Yes
#Relationship status 	Married
#Social Security Override 	$4000
#Additional/other income 	$500
#Number of years retirement needs to last 	20
#Post-retirement income increase with inflation 	Yes
#Percent of final annual income desired 	75%
#Pre-retirement investment return 	8%
#Post-retirement investment return 	5%



@SecurianAssignment
Feature:Securian feature

  Scenario: Retirement calculator tests
    When user user launch the page
    Then User enters "currentAge" to inputBox
    Then User enters "retirement" to inputBox
    Then User enters "currentAnnualIncome" to inputBox
    Then User enters "spouseAnnualIncome" to inputBox
    Then User enters "currentRetireSavings" to inputBox
    Then User enters "currentRetireContribution" to inputBox
    Then User enters "annualRetirementContributionIncrease" to inputBox
    Then User user click on "Social_Security_income" button
    Then User user click on "relatantipStatus" button
    Then User enters "socialSecurityOverride" to inputBox
    Then User user click on "adjustDefaultValuesButton" button
    Then User enters "additionalOtherIncome" to inputBox
    Then User enters "numberOfYearsRetirement" to inputBox
    Then User user click on "postRetirementIncomeIncreaseWithInflation" button
    Then User enters "percentOfinFalAnnualIncomeDesired" to inputBox
    Then User enters "preRetirementInvestmentReturn" to inputBox
    Then User enters "postRetirementInvestmentReturn" to inputBox
    Then User user click on "save" button
    Then User user click on "calculate" button
    And User user validates on "Results" is displayed








