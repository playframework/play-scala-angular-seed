package controllers

import javax.inject._

import play.api.mvc._
import play.libs.Json

class AppSummary(val cn: String) {
  var content: String = cn
}


/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def appSummary = Action {
    val jsonNode = Json.toJson(new AppSummary("Java Play Angular Seed"))
    Ok(jsonNode).as("application/json")
  }

}
