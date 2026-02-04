def call(String ImageName, String ImageTag, String DockerHubUser){
  echo "Creating the Code Build."
  sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
}
