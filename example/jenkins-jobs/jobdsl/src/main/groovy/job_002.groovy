pipelineJob('job_002') {
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
                        stage('Greet') {
                            steps {
                                echo "Hello!! ${name}"
                                shell "npm -v"
                            }
                        }
                    }
                }
            '''.stripIndent())
            sandbox()
        }
    }
}
