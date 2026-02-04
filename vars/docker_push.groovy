def call(String ImageName, String ImageTag, String dockerHubUser){
  echo "Pushing the image to Docker Hub"
  withCredentials([usernamePassword(
                    credentialsId:"docker-hub-cred", 
                    passwordVariable:"dockerHubPass", 
                    usernameVariable:"dockerHubUser")
                    ]){
  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  sh "docker image tag ${ImageName}:${ImageTag} ${env.dockerHubUser}/${ImageName}:${ImageTag}"
  sh "docker push ${env.dockerHubUser}/${ImageName}:${ImageTag}"
}
}
