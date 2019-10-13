package io.konv.quarkus

import java.util.*
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import kotlin.collections.HashSet

@Path("/fruits")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class FruitResource {

    private val fruits: MutableSet<Fruit> = Collections.synchronizedSet(HashSet())

    init {
        fruits.add(Fruit("Apple34", "Winter fruit"))
        fruits.add(Fruit("Pineapple", "Tropical fruit"))
    }

    @GET
    fun getAll() = fruits.toTypedArray()

    @POST
    fun post(fruit: Fruit): Array<Fruit> {
        fruits.add(fruit)
        return fruits.toTypedArray()
    }

    @DELETE
    fun delete(fruit: Fruit): Array<Fruit> {
        fruits.remove(fruit)
        return fruits.toTypedArray()
    }
}