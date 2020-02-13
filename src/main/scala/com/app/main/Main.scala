package com.app.main

import com.app.model.User
import com.app.util.Greeter

object Main extends App {

  val user = User("Sam", 30)
  println(Greeter.sayHello(user.name))

}
