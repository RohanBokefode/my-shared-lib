def call() {
    parallel(
        Task1: { sh 'echo Running Task 1' },
        Task2: { sh 'echo Running Task 2' }
    )
}
