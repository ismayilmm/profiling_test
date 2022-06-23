node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'Default Maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=profiling-test"
    }
  stage 'test-downstream'
    node {
      def job = build job: 'Build_From_Source'
}
  }
}
