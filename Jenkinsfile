pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
                sh 'mvn -Dmaven.test.failure.ignore clean package'
                step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
            }
        }
        stage('Deploy') {
            steps {
                task('Deploy to UAT') {
                    echo 'Deploying to UAT...'
                    sleep 4
                    echo 'Successfully deployed to UAT'
                }

                task('Deploy to production') {
                    echo 'Deploying to production...'
                    sleep 4
                    echo 'Deployed to production!'
                }
            }
        }
    }
}
