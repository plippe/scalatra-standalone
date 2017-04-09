import org.scalatra._

class HelloWorld extends ScalatraServlet {

  get("/") {
    "Hello World"
  }

}
