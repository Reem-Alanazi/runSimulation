import kotlin.random.Random
import kotlin.random.nextInt
fun main() {

    runSimulation("Guyal", ::printConstructionCost)
    { playerName, numBuildings ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    printConstructionCost(6)
}
inline fun runSimulation (playerName : String,
                       costPrinter :(Int) -> Unit,
                   greetingFunction : (String,Int) -> String){
    val numBuildings = Random.nextInt(1..3)
    costPrinter(numBuildings)
    println(greetingFunction(playerName,numBuildings))

}
fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}


