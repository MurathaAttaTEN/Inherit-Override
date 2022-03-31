fun main() {
    var banker = Banker("peter", 25)
    var doctor = Doctor("lily", 35)
    var farmer = Farmer("mimi", 43)

    farmer.talk("hello")
    doctor.sleep()
    banker.eat()
    println(banker is Banker)
    println(doctor is Doctor)
    println(farmer is Farmer)
    println(farmer is Any)
    println(banker is Person)
    println(doctor is Person)
    farmer.eat()
    doctor.introduction()
    farmer.introduction()
    banker.introduction()




}

open class Person(var name: String, var age: Int) {
    fun talk(word: String) {
        println(word)
    }

    open fun eat() {
        println("yum")
    }

    fun sleep() {
        println("xxx")
    }
   open fun introduction(){
        println("hi my name is  $name")
    }


}

class Banker(name: String, age: Int) : Person(name, age) {

    fun countMoney(notes: Array<Int>): Int {
        return notes.sum()
    }
}

 class Doctor(name: String, age: Int) : Person(name, age) {


    fun treatPatient(patient: String, disease: String) {
        println("Treating $patient for $disease")

    }

    override fun introduction(){
        println("hi my name is Doctor $name")
    }
}

class Farmer(name: String, age: Int) : Person(name, age) {

    fun cultivatedLand() {
        println("dig dig dig")
    }

    override fun eat() {
        println("i am eating all the food that i've grown")
    }


}
