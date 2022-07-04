
job('sample-job-001') {
    description 'sample job 001'
    logRotator(1)
    steps {
        echo('Sample job 001')
        shell('pwd')
        shell('java -version')
    }
}
