def call(String url, String branch) {
  echo "This is the code cloning..."
  git url: "https://github.com/Ashik-Ahammad/django-notes-app", branch:"main"
  echo "Code Cloning Successful"
}
