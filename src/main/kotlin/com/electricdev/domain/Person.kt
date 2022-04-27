package com.electricdev.domain


import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleObjectProperty
import javafx.beans.property.SimpleStringProperty
import java.time.LocalDate
import java.time.Period

class Person(id: Int, name: String, birthday: LocalDate) {
    val idProperty = SimpleIntegerProperty(id)

//    var id by idProperty

    val nameProperty = SimpleStringProperty(name)
//    var name by nameProperty

    val birthdayProperty = SimpleObjectProperty(birthday)
//    var birthday by birthdayProperty

    val age: Int get() = Period.between(birthdayProperty.value, LocalDate.now()).years
}