
//Question 1
fun item(){
    var items= listOf<String>("table","laptop","pen","book","clothes","bags","markerpen","flower","ruler","Tv")
    for (x in items){
        if (x.length%2==0){
        println(x)
        }
    }

}
//Question 2
data class People(var height: Double,var average:Double)
fun peopleHei(height:List <Double>):People{

    var total=height.sum()

    var average=height.average()
    return People(total,average)

}

//question 3
data class Person(var name:String,var age:Int,var height:Int,var weight:Int)
fun sortedPeople(){
var personList= listOf(
    Person("Mandek",12,4,30),
    Person("John",40,20,67),
    Person("Hamdi",30,20,80),
    Person("Nair",21,12,69),
)
var sorted= personList.sortedByDescending { Person -> Person.age }
println(sorted)
}

//question 4
fun adding(){
    var personList= mutableListOf(
        Person("Mandek",12,4,30),
        Person("John",40,20,67),
        Person("Hamdi",30,20,80),
        Person("Nair",21,12,69),
    )
    personList.addAll(listOf(Person("Aisha",30,13,56)))
    println(personList)
}
//Question 5
data class Car(var registration:String,var mileage:Int)
fun car(cars:List<Car>) :Int{
var mileage=0
    cars.forEach{ car -> car.mileage
    mileage+=car.mileage
    }
    var average=mileage/cars.count()
    return average
}

fun main(){
    item()

   println( peopleHei(listOf(66.99,77.00,12.807)))

   sortedPeople()

adding()

var myList=listOf(
    Car("nairobi22",5800),
    Car("nakuru01",7700),
    Car("kakuma08",90000)
)
    println(car(myList))
    }
