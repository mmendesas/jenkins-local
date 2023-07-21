job('job_001_sample') {
    description 'sample jobdsl 001'
    logRotator(1)
    steps {
        shell('echo Sample job 001')
        shell('pwd')
        shell('ls -lash')
    }
}
