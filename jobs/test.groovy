project_name = "jenkins-pipeline-python"
repo = "git@github.com:pachas7/JenkinLab.git"
repo_name = "repo"

pipelineJob(project_name) {
  definition {
    triggers{
      scm('H/5 * * * *')
    }
    
    cpsScm{
      scm {
        git {
          remote {
            name(repo_name)
            url(repo)
          }
        }
        scriptPath("Jenkinsfile")
      }
    }
  }
}
