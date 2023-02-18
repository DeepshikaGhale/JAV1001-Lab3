//tests the die function
fun diceGame(){
    //test zero argument constructor
    val rollD6 = Die()
    rollD6.printResult()

    //test one argument constructor
    val rollD20 = Die(noOfSides = 20)
    rollD20.printResult()

    //test two argument constructor
    val rollD10 = Die(name = "Percentile", noOfSides = 10)
    rollD10.printResult()

    //test the roll method of all three constructors created above
    println("\nTesting the roll method:\n")

    rollD6.testRoll()
    rollD20.testRoll()
    rollD10.testRoll()

    //calculate highest value
    rollD20.highestValue()

}