def call() {
    build job: 'child-job',
          parameters: [string(name: 'BRANCH', value: 'main')]
}
