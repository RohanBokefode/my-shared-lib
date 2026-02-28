def call(int num) {
    def fact = 1
    for(int i = 1; i <= num; i++) {
        fact = fact * i
    }
    return fact
}
