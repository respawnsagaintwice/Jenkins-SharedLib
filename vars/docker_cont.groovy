def call(String image_name, String tag) {
    echo "building ${image_name}:${tag}"
    sh "docker build -t ${image_name}:${tag} ."
    echo "container created"
}   
