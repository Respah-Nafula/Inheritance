fun main(){
        var myCar=Car("BMW","AudiA3","Black",8)
        println( myCar.Calculateparkingfees(4))
        myCar.Identity()
        myCar.Carry(2)
        var myBus=Bus("Tesla","Hatchback","white",30)
        myBus.mixTripFare(fare = 100.0)
        myBus.Carry(30)
        println(myBus.Calculateparkingfees(3))
        println(myBus.mixTripFare(15.2))
        }
    open class Car(var make:String,var model:String,var color:String,var capacity:Int){
        fun Carry(people:Int){
            var D=people-capacity

            if (people<=capacity)
                println("Carrying $people passengers")
            else
                println("over capacity by $D people")


        }
        fun Identity(){
            println("I am $color $make $model")

        }
        open fun Calculateparkingfees(hours:Int):Int{
            var fare=hours*20
            return fare


        }

    }
    class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){
        fun mixTripFare(fare:Double):Double{
            var z=fare*capacity
            return z
        }

        override fun Calculateparkingfees(hours: Int): Int {
            var w=hours*capacity
            return w
        }

    }