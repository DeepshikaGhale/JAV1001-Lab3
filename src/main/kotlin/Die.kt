import kotlin.random.Random

class Die {
    var name : String = ""
    var noOfSides : Int = 0
    var randomSideUp : Int = 0

    private fun roll(){
        randomSideUp = Random.nextInt(1, noOfSides+1)
    }
}