pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            cleanWs(cleanWhenFailure: true)
            sh 'sh \'cp - r /var/lib /var/test\''
            sleep 10
            kubernetesEngineDeploy()
          }
        }

        stage('deploy') {
          steps {
            readFile 'test'
          }
        }

      }
    }

  }
}