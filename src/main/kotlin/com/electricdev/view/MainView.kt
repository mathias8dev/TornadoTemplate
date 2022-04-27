package com.electricdev.view

import com.electricdev.domain.Person
import tornadofx.*
import java.time.LocalDate

class MainView : View("Hello TornadoFX") {

    private val persons = listOf(
        Person(1, "Samantha Stuart", LocalDate.of(1981, 12, 4)),
        Person(2, "Tom Marks", LocalDate.of(2001,1,23)),
        Person(3, "Stuart Gills", LocalDate.of(1989,5,23)),
        Person(4, "Nicole Williams", LocalDate.of(1998,8,11))
    ).asObservable()


    override val root = tableview(persons) {
        isEditable = true

        column("ID", Person::idProperty).makeEditable()
        column("Name", Person::nameProperty)
        column("Birthday", Person::birthdayProperty)
        readonlyColumn("Age", Person::age)
    }
}

