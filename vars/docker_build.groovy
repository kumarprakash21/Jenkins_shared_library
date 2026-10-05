def call(String DockerhubUser, String Projectname, String ImageTag) {
  sh "docker build -t ${DockerhubUser}/${Projectname}:${ImageTag} ."
}
