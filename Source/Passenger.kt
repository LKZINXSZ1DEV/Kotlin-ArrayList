package org.example

class Passenger {
    private var name: String = "Null"
    private var age: Int = -1
    private var gender: String = "Null"

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return this.age
    }

    fun setAge(age: Int) {
        this.age = age
    }

    fun getGender(): String {
        return this.gender
    }

    fun setGender(gender: String) {
        this.gender = gender
    }

    fun setValues(name: String, age: Int, gender: String) {
        this.setName(name)
        this.setAge(age)
        this.setGender(gender)
    }
}