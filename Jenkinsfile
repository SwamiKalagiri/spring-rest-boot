pipeline {
    agent none
    stages {
        stage('build') {
         agent {
                dockerfile {
                  filename '.pipeline/docker/build.dockerfile'
                  label 'master'
                }
              }
         steps {
               setup_scripts()
               sh '/pipeline/resources/verify.sh'
            }
        }
    }
}

def setup_scripts() {
    sh 'chmod u+x /pipeline/resources/build.sh'
}
