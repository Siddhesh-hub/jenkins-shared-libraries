def call(){
  echo "Deploying the latest build."
  sh "docker-compose down && docker-compose up -d"
}
