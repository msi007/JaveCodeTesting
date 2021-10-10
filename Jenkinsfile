pipeline{
    agent{label 'level001'}
      stages{ 
          stage("Memory of 130 server"){
              steps{
                 sh 'ip addr' 
                 sh 'free -m'
              }
              
          }
         stage("Git checkout"){
             steps{
              git branch: 'main', credentialsId: 'fc7c1a76-cde1-4d4f-9e3c-3a19b635c457', url: 'https://github.com/msi007/JaveCodeTesting.git'     
             }
         }
      }
    
}
