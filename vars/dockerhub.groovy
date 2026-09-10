def call(String cred , String username, String image_name , String tag){
  echo 'pushing to dockerhub'
  withCredentials([usernamePassword(credentialsId:cred, usernameVariable: 'dockerhubuser', passwordVariable: 'dockerhubpass' )]){
  sh "docker login -u $dockerhubuser -p $dockerhubpass"
  sh "docker image tag ${image_name}:${tag} ${username}/${image_name}:${tag}"
  sh "docker push ${username}/${image_name}:${tag}" 
  }
  echo 'pushed to dockerhub'
}
// //
