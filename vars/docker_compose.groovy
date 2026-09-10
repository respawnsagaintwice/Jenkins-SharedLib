def call() {
    echo 'deploying'
    sh 'docker rm -f db_cont django_cont || true'
    sh 'docker compose up -d'
}   
