def call () {
    withSonarQubeEnv('sonar-server') {
                    sh ''' $SCANNER_HOME/bin/sonar-scanner -Dsonar.projectName=YouTube \
                    -Dsonar.projectKey=YouTube '''
                }
}