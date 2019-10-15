package io.konv.quarkus.entities

import javax.persistence.*

class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    var id: Long = 0

    @Column(name = "NAME")
    var name: String = ""
}