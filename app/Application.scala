package controllers

import play.api.mvc.{Action, Controller}
import javax.inject.Singleton

@Singleton
class InjectedApplication extends Controller {

  def index = Action { 
    Ok("Index OK from InjectedController (See /noninjected)")
  }
}

object NonInjectedApplication extends Controller {

  def index = Action {
    Ok("Index OK from NonInjectedController (See /)")
  }
}
