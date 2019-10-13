package io.konv.quarkus

import io.vertx.axle.core.Vertx
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/reactive")
class ReactiveResource {

    @Inject
    lateinit var vertx: Vertx

    data class Greeting(var greeting: String)

    @GET
    @Path("/greet")
    @Produces(MediaType.TEXT_PLAIN)
    fun greet(): CompletionStage<String> {

        // When complete, return the content to the client
        val future = CompletableFuture<String>()
        future.complete("Hello2")

        return future
    }
}