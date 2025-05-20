def call(String url, String branch) {
  echo "This is the code cloning..."
  git url: "${url}", branch: "${branch}"
  echo "Code Cloning Successful"
}
