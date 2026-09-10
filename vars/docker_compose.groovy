def call() {
    echo 'deploying'
    sh 'docker ps -a --filter "name=cont" -q | xargs -r docker rm -f'
    sh 'docker compose up -d'
}   
