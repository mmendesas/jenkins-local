folder('admin') {
    description('Folder with config and seed jobs')
}

job('admin/__jenkins-jobs') {
    description 'Seed for jenkins-jobs'
    logRotator(3)
    scm {
        git {
            remote {
                url("${LOCAL_USER}@docker.for.mac.localhost:${LOCAL_JOBS}/.git")
            }
            branch(':^origin/main$')
        }
    }
    steps {
        shell('mkdir -p jobdsl/src/main/groovy')
        dsl {
            external('jobdsl/job-001.groovy')
            removeAction('DELETE')
        }
    }
    configure {
        project ->
            (project / 'builders' / 'javaposse.jobdsl.plugin.ExecuteDslScripts' / ignoreMissingFiles).setValue(true)
    }
}
