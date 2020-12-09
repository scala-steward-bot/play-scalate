# play-scalate

## Install

```scala
libraryDependencies ++= Seq(
  "org.scalatra.scalate" %% "play-scalate" % "0.5.0",
  "org.scalatra.scalate" %% "scalate-core" % "1.9.1",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

unmanagedResourceDirectories in Compile += baseDirectory.value / "app" / "views"
```

## Usage

```scala
package controllers

import javax.inject.{ Inject, Singleton }
import play.api._
import play.api.mvc._
import com.github.tototoshi.play2.scalate._

@Singleton
class Application @Inject() (scalate: Scalate) extends Controller {

  def index = Action { implicit request =>
    Ok(scalate.render("index.jade", Map("message" -> "hello")))
  }

}
```
