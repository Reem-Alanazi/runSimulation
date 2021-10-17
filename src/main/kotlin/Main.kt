import kotlin.random.Random
import kotlin.random.nextInt
fun main() {

    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

}
    //Calling Fun
    runSimulation("Reem",greetingFunction)
    printConstructionCost(6)

}


inline fun runSimulation (playerName : String,
                   greetingFunction : (String,Int) -> String){
    val numBuildings = Random.nextInt(1..3)
    println(greetingFunction(playerName,numBuildings))

}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}


