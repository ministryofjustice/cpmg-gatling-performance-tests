gatling-maven-plugin-demo
=========================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationsClass=simulations.XMLEndpointAPI

or simply:

 mvn clean gatling:test -DUsers=1 -DDuration=1 -DEnv=preprod -DData=normalData

    
    -DUSER => This will allow the test to run with 1 user (1 Message/Court) via the terminal command prompt. 
    -DDuration => This will allow the test to run for 1 minute via the terminal command prompt. - we normally specify that it should be 10 minute test.
    -DEnv=preprod => This will allow the tests to be ran against the preprod enviroment. 
    
    -DData=normalData => This will allow for the test to be ran with mock data just representing as live data. Is used if the user does not have access to live data.
    OR USE
    -DData=offenderData => This will allow for the test to be ran with live data. 
    NOTE:(If live data is available and is the preffered choice the file must be saved in resources/mined-data/defendantMatch.csv)
    (where 'defendantMatch.csv' is the name of the file of your live data)
    NOTE: The formatting should follow the same format as seen inside defendantMatch_Dummy.csv 
    
    If the number of cases need adjusting, this can be done by altering .body(ElFileBody("bodies/25CaseXMLMessage.xml")).asXml in XMLEndpointAPI file. Changing '25CaseXMLMessage.xml' to '100CaseXMLMessage.xml'. This will allow a bigger message for more intense load test purposes. 
