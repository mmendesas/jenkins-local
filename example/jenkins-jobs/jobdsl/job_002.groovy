pipelineJob('job_test_002') {
    description 'Running inside an external agent'
    parameters {
        stringParam('name', 'Someone', 'name of the person')
    }
    definition {
        cps {
            script('''
                pipeline {
                    agent { label 'agent-001' }
                    stages {
                        stage('First Stage') {
                            steps {
                                echo "Hello!! ${name}"
                                echo "We are running a sample job inside an external agent"
                                shell "npm -v"
                                shell 'pwd; sleep 5000; echo "Took 5 seconds"'
                            }
                        }
                    }
                }
            '''.stripIndent())
            sandbox()
        }
    }
}
