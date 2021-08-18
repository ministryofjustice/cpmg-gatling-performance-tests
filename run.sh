#!/usr/bin/env sh

DATE=$(date +"%Y-%m-%d")
TIME=$(date +"%H-%M-%S")
OUTPUT_PATH=cpmg-gatling-performance-tests

aws s3 cp s3://${S3_BUCKET_NAME}/${OUTPUT_PATH}/defendantMatch.csv /app/src/test/resources/mined-data

mvn gatling:test -DUsers=${PERF_TEST_USERS} -DDuration=${PERF_TEST_DURATION} -DEnv=preprod -DData=offenderData -q

aws s3 cp /app/target/gatling/ s3://${S3_BUCKET_NAME}/${OUTPUT_PATH}/${DATE}/${TIME}/reports --recursive
aws s3 cp /app/createOutputVariables.csv s3://${S3_BUCKET_NAME}/${OUTPUT_PATH}/${TIMESTAMP}/createOutputVariables.csv
