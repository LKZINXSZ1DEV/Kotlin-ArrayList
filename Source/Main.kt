package org.example

fun main() {
    val transport = Transport()

    val names = listOf("David", "Andy", "Joseph")
    val age = listOf(30, 28, 64)
    val gender = listOf("Male", "Female", "Male")

    transport.setName("Cloud Transport")
    transport.setId(1038)

    println("-- Transport Info --" +
            "\n" +
            "Name: " + transport.getName() +
            "\n" +
            "ID: " + transport.getId() +
            "\n")

    for (i in names.indices) {
        transport.getPassenger().setValues(names[i], age[i], gender[i])
        transport.setPassenger(transport.getPassenger())

        println("-- Passenger Info [$i] --" +
                "\n" +
                "Name: ${transport.getPassengerList()[i].getName()}" +
                "\n" +
                "Age: ${transport.getPassengerList()[i].getAge()}" +
                "\n" +
                "Gender: ${transport.getPassengerList()[i].getGender()}" +
                "\n")
    }
}