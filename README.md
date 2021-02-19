gatling-maven-plugin-demo
=========================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $mvn gatling:test -Dgatling.simulationsClass=simulations.XMLEndpointAPI

or simply:

 mvn clean gatling:test -DUsers=1 -DDuration=1 -DEnv=preprod -DData=normalData

    
    -DUSER => This will allow the test to run with 1 user (1 Message/Court) via the terminal command prompt. 
    -DDuration => This will allow the test to run for 1 minute via the terminal command prompt. - we normally specify that it should be a 10 minute test.
    -DEnv=preprod => This will allow the tests to be ran against the preprod enviroment. - In previous tests we tested against 'dev' and 'preprod' 
    
    -DData=normalData => This will allow for the test to be ran with mock data just representing as live data. Is used if the user does not have access to live data.
    OR USE
    -DData=offenderData => This will allow for the test to be ran with live data. 
    NOTE:(If live data is available and is the preffered choice the file must be saved in resources/mined-data/defendantMatch.csv)
    (where 'defendantMatch.csv' is the name of the file of your live data)
    NOTE: The formatting should follow the same format as seen inside defendantMatch_Dummy.csv 
    
    If the number of cases need adjusting within the message, this can be done by altering .body(ElFileBody("bodies/25CaseXMLMessage.xml")).asXml in XMLEndpointAPI file. Changing '25CaseXMLMessage.xml' to '100CaseXMLMessage.xml'. This will allow a bigger message for more intense load test purposes. 


 For error handling and monitoring of requests that have been sent, we check that the trigger viewing the file createdOutputVariables.csv 
 This file contains the following headers "CaseNumber,CourtCode,CourtRoomNumber,LocalTime"
 These variables within this file will appear after a test is ran. 
 They can be used to query the requests that were made within the database to confirm that services were triggered and can track any errors seen within the process.
  
# Build and run Docker image locally

If making changes to the docker image you can build and run these locally using the following commands:

`docker build ./ -t cpmg-performance-test`

You will need to retrieve the AWS S3 access details from the kubernetes cluster secret to run the tests with the following command:

`docker run -e AWS_ACCESS_KEY_ID={ACCESS_KEY_ID} -e AWS_SECRET_ACCESS_KEY={SECRET_ACCESS_KEY} -e S3_BUCKET_NAME={S3_BUCKET_NAME} cpmg-performance-test:latest`