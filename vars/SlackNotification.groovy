Skip to content
 
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@yellapantula 
 The password you provided is weak and can be easily guessed. To increase your security, please change your password as soon as possible.

Read our documentation on safer password practices.

1
1 17 lvthillo/shared-library
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Insights
shared-library/vars/slackNotifier.groovy
@lvthillo lvthillo Update slackNotifier.groovy
ec1e675 on Apr 11, 2018
17 lines (15 sloc)  663 Bytes
    
#!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
  }
  else if( buildResult == "FAILURE" ) { 
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
  }
  else if( buildResult == "UNSTABLE" ) { 
    slackSend color: "warning", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable"
  }
  else {
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear"	
  }
}
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
