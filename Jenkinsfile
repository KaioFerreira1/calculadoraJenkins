pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                bat 'mvn clean package -DskipTests=true'
            }
        }
        stage('Tests'){
            steps{
                bat 'mvn test'
            }
        }
        stage('Deploy'){
            steps{
                'deploy adapters: [tomcat9(credentialsId: 'Login', path: '', url: 'http://127.0.0.1:9000/')], contextPath: null, war: 'target/calculadora.war''
            }
        }
    }
}