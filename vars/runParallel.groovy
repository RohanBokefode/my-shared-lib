def call() {
    parallel(
        Maven: { sh 'mvn clean install' },
        NPM: { sh 'npm install' }
    )
}
