import groovy.json.JsonSlurper

def call(String fileName) {
    def content = readFile(fileName)
    def json = new JsonSlurper().parseText(content)
    return json
}
