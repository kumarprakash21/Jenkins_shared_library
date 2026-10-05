def call(String url, String branch){
  echo "This is cloing the repo"
  git url:"${url}",branch:"${branch}"
  echo "Repo cloning was completed"
}
