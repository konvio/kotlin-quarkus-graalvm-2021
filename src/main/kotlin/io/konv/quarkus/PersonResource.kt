package io.konv.quarkus

import io.konv.quarkus.entities.Person
import io.konv.quarkus.entities.PersonRepository
import javax.inject.Inject
import javax.persistence.GeneratedValue
import javax.transaction.Transactional
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
class PersonResource {

    @Inject
    lateinit var personRepository: PersonRepository

    @GET
    fun findAll(): List<Person> = personRepository.listAll()

    @GET
    @Path("/{id}")
    fun findById(@PathParam("id") id: Long) = personRepository.findById(id)

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    fun post(person: Person) = personRepository.persist(person)
}