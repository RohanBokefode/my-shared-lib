def call() {
    withCredentials([
        usernamePassword(
            credentialsId: 'my-creds',
            usernameVariable: 'USER',
            passwordVariable: 'PASS'
        )
    ]) {
        sh "echo Login with $USER"
    }
}
