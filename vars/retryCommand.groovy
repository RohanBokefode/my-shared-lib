def call(String cmd) {
    retry(3) {
        sh cmd
    }
}
