package org.example

class Transport {
    private var passenger = Passenger()
    private var passengerList = ArrayList<Passenger>()
    private var name: String = "Null"
    private var id: Int = -1

    fun getName(): String {
        return this.name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getId(): Int {
        return this.id
    }

    fun setId(age: Int) {
        this.id = age
    }

    fun getPassenger() : Passenger {
        return this.passenger
    }

    fun setPassenger(passenger: Passenger) {
        this.passenger = passenger
        this.passengerList.add(this.passenger)
    }

    fun getPassengerList() : ArrayList<Passenger> {
        return this.passengerList
    }
}