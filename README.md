gatling-maven-plugin-demo
=========================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationsClass=simulations.XMLEndpointAPI

or simply:

 mvn clean gatling:test -DUsers=1 -DDuration=1 -DEnv=preprod

    
    -DUSER => This will allow the test to run with 1 user (1 message) via the terminal command prompt. 
    -DDuration => This will allow the test to run for 1 minute via the terminal command prompt. 
    -DEnv=preprod => This will allow the tests to be ran against the preprod enviroment. 
    
    
    If the number of cases need adjusting, this can be done by altering .body(ElFileBody("bodies/25CaseXMLMessage.xml")).asXml in XMLEndpointAPI file. Changing '25CaseXMLMessage.xml' to '100CaseXMLMessage.xml'. This will allow a bigger message for more intense load test purposes. 
