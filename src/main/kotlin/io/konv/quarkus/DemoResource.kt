package io.konv.quarkus

import com.google.common.hash.Hashing
import java.nio.charset.StandardCharsets
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/demo")
class DemoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/hash/sha256/{text}")
    fun sha256(@PathParam("text") text: String): String {
        return Hashing.sha256()
                .hashString(text, StandardCharsets.UTF_8)
                .toString()
    }
}
