def call() {
    echo 'deploying'
    sh 'docker compose down --remove-orphans'
    sh 'docker compose up -d'
    echo 'deployed'
}   
