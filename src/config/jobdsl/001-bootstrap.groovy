folder('admin') {
    description('Folder with config and seed jobs')
}

job('admin/__jenkins-jobs') {
    description 'Seed for jenkins-jobs'
    logRotator(3)
    scm {
        git {
            remote {
                url("${LOCAL_USER}@host.docker.internal:${LOCAL_JOBS}/.git")
                credentials('ssh-local-key')
            }
            branch(':^origin/main$')
        }
    }
    steps {
        shell('mkdir -p jobdsl/src/main/groovy')
        dsl {
            external('example/jenkins-jobs/**/*.groovy')
            removeAction('DELETE')
        }
    }
    configure {
        project ->
            (project / 'builders' / 'javaposse.jobdsl.plugin.ExecuteDslScripts' / ignoreMissingFiles).setValue(true)
    }
}
