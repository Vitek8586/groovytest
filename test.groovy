#!groovy
//check ub1 properties
properties([disableConcurrentBuilds])

pipeline{
	agent{
		label 'master'
		}
	options{
		buildDiscarder(logRotator(numToKeepStr: '10',artifactNumToKeepStr: '10'))
		timestamps()
		}

	
	stages {
	       	stage("Preparations") {
			                steps{
						ipconfig	
						}
					}

		}
}
