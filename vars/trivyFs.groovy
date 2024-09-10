def call() {
  sh 'trivy fs . > fs.txt'
}
