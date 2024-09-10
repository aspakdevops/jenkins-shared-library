def call(String dockerHubUsername, String imageName) {
    // Build the Docker image
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=4fc15c309amsh75e21ff8aa7f542p18e9cbjsndbded5d7c159 -t ${imageName} ."
     // Tag the Docker image
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    // Push the Docker image
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker-cred']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
    }
}
