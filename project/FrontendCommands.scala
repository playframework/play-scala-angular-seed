/**
  * Frontend build commands.
  * Change these if you are using some other package manager. i.e: Yarn
  */
object FrontendCommands {
  val dependencyInstall: String = "npm install"
  val test: String = "npm run test-no-watch"
  val devServe: String = "npm run start"
  val devBuild: String = "npm run build-dev"
  val prodBuild: String = "npm run build-prod"
}