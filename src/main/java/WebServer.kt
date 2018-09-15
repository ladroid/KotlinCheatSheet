import io.vertx.core.Vertx

fun start() {
    var vertx = Vertx.vertx()
    var server = vertx.createHttpServer().requestHandler({httpServerRequest ->
        httpServerRequest.response().end("Hello Vert.x") }).listen(8080,
            {asyncResult -> if(asyncResult.succeeded()) {
                println("It works!!!")
            } else {
                println("Does not work!!!")
            }})

}

fun main(args: Array<String>) {
    start()
}