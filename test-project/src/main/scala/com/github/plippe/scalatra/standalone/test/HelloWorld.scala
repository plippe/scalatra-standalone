package com.github.plippe.scalatra.standalone.test

import org.scalatra._

class HelloWorld extends ScalatraStandaloneTestStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
