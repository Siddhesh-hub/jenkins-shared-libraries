def call(){
  echo "Deploying the latest build."
  sh "docker-compose up -d"
}
