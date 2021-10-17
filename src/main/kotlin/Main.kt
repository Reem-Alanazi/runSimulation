import kotlin.random.Random
import kotlin.random.nextInt
fun main() {

    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"

}
runSimulation("Reem",greetingFunction)


}


inline fun runSimulation (playerName : String,
                   greetingFunction : (String,Int) -> String){
    val numBuildings = Random.nextInt(1..3)
    println(greetingFunction(playerName,numBuildings))

}


