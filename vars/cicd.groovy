def gitdownload(repo)
{
  git "https://github.com/nikki02c1219-bit/${repo}.git"
}
def gitbuild()
{
  sh "mvn package"
}
def gitdeploy(jobname,ip,con)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${con}.war"
}  
