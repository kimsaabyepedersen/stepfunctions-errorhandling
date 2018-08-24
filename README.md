# AWS Step Functions Error Handling Demo

This is a Java version of [Handle Errors in Serverless Applications](https://aws.amazon.com/getting-started/tutorials/handle-serverless-application-errors-step-functions-lambda/)

Note that there is a difference in the `template.yaml` in this code compared to the one in the tutorial. In this code, the exceptions use the fully qualified class name instead of just the class name.

## Prerequisites
* [SAM CLI](https://github.com/awslabs/serverless-application-model) installed.
* Java 8 or higher.
* A recent Maven version.

## How to run
First create an S3 bucket with some name. Then edit `package-and-deploy.sh.tmp` and replace <BUCKET_NAME> with that name.
Then rename  `package-and-deploy.sh.tmp` to `package-and-deploy.sh` and run `sh package-and-deploy.sh`

