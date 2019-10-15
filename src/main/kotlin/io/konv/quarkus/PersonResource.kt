package io.konv.quarkus

import io.konv.quarkus.entities.Person
import io.konv.quarkus.entities.PersonRepository
import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
class PersonResource {

    @Inject
    lateinit var personRepository: PersonRepository

    @GET
    fun findAll(): List<Person> = emptyList()

    @GET
    @Path("/{id}")
    fun findById(@PathParam("id") id: Long) = Person()

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    fun post(person: Person) {
    }
}