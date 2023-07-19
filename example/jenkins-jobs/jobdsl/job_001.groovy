job('job_test_001') {
    description 'sample job 001'
    logRotator(1)
    steps {
        shell('echo Sample job 001')
        shell('pwd')
        shell('java -version')
    }
}
