package io.konv.quarkus

import io.reactivex.Single
import io.vertx.core.Vertx

import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType
import java.util.concurrent.CompletableFuture
import java.util.concurrent.CompletionStage

import java.util.concurrent.TimeUnit.MILLISECONDS
import java.util.concurrent.TimeUnit.NANOSECONDS

@Path("/hello")
class GreetingResource {

    @Inject
    internal var vertx: Vertx? = null

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{name}")
    fun greeting(@PathParam("name") name: String): Single<String> {

        return Single.just(name)
    }
}
