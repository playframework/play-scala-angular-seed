package controllers

import javax.inject._

import play.api.libs.json.Json
import play.api.mvc._

@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def appSummary = Action {
    Ok(Json.obj("content" -> "Scala Play Angular Seed"))
  }

  def postTest = Action {
    Ok(Json.obj("content" -> "Post Request Test => Data Sending Success"))
  }
}
