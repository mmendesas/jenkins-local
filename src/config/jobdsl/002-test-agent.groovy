#!groovy

job('admin/__test-agent') {
    label('agent-001')

    steps {
        shell("echo 'Hello World'")
        shell('java -version')
        shell('pwd')
        shell('node --version')
    }
}
