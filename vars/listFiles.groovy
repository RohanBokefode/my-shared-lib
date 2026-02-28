def call() {
    return sh(script: 'ls -l', returnStdout: true)
}
