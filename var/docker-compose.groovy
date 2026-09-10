def call(){
  echo 'depoying'
  sh 'docker compose down && docker compose up -d'
}
