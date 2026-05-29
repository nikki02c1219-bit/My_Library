def gitdownload(repo)
{
  git "https://github.com/nikki02c1219-bit/${repo}.git"
}
def gitbuild(repo)
{
  sh "mvn package"
}
