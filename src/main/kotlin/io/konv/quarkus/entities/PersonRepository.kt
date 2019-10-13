package io.konv.quarkus.entities

import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
open class PersonRepository : PanacheRepository<Person>