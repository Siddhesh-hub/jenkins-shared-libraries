def call(String GitUrl, String GitBranch){
  echo "Cloning the code from repository."
  git url: "${GitUrl}", branch:"${GitBranch}"
  echo "Code cloning successfull."
}
