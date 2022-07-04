#!groovy

job('admin/__test-agent') {
    label('agent-001')

    steps {
        // test if agent has java + node
        shell("echo 'Hello World'")
        shell('java -version')
        shell('pwd')
        shell('node --version')
    }
}
