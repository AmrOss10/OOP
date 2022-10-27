fun main(){

    val car1=Tesla("Tesla Model X","Blue",260 )
    val car2=BMW("BMW 8 Series Gran Coupe M","White",220)

    println("Car Model: ${car1.model}\n color is: ${car1.color}\n speed is: ${car1.speed}\n fuel type of the car is: ${car1.getFuelType()}")

    println("Car Model: ${car2.model}\n color is: ${car2.color}\n speed is: ${car2.speed}\n fuel type of the car is: ${car2.getFuelType()}")
}

abstract class Car(var model:String,var color:String,var speed:Int){
    abstract fun getFuelType()
}

class BMW (model: String, color: String, speed: Int) :Car(model, color, speed){
    override fun getFuelType(){
        println("Gasoline 95")
    }
}

class Tesla(model: String, color: String, speed: Int) :Car(model, color, speed){
    override fun getFuelType() {
        println("no fuel type, Tesla is an electric car.")
    }
}