def call() {
    sh 'trivy image aspakdevops/youtube:latest > trivyimage.txt'
}
