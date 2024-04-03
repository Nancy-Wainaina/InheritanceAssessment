//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
val car = Car("Subaru", "legacy", "white", 4)
    car.carry(10)
    car.identity()
    println(car.calculateParkingFees(8))


    val bus = Bus("Isuzu", "luxury", "blue", 49)
    println(bus.calculateParkingFees(2))
    println(bus.maxTripFare(700.00))






}

open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people <= capacity){
            println("Carrying $people passengers")
        }
        else{
            var x = people - capacity
            println("Over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int) :Int{
        return hours*20
    }

}

class Bus(make:String,  model:String, color:String,  capacity:Int) :Car(make,model,color,capacity){
   override  fun calculateParkingFees(hours:Int) :Int{
        return hours*capacity
    }
    fun maxTripFare(fare:Double) :Double{
        return fare*capacity
    }

}