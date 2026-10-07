def call(){
 echo "Scan srated by Trivy"
  sh "trivy fs ."
  echo "Scan completed successfully"
}
