/*
* Deepshika Ghale
* Student ID: A00272439
* Program name: App Development for Android
* Program code: JAV1001
* Assignment 3
*/

//tests the die function
fun main(){
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

    //Create 5 six-sided dice. Roll each Die in a loop until you get 5 of a kind. .
    getSameSideUp()
}

fun getSameSideUp(){
    println("Creating 5 d6...")

    var listOfDiceSides = mutableListOf<Int>()

    //collect the number of rolls
    var numberOfRolls = 0
    var isDistinct = true

    //create 5 six-sided dice

    val roll1 = Die()
    val roll2 = Die()
    val roll3 = Die()
    val roll4 = Die()
    val roll5 = Die()

    //roll each Die in a loop until you get 5 of a kind
    while (isDistinct){
        //roll the dice
       roll1.roll()
       roll2.roll()
       roll3.roll()
       roll4.roll()
       roll4.roll()

        //Count the number of rolls
        numberOfRolls++

        //add the random side up to list
        listOfDiceSides.add(roll1.randomSideUp)
        listOfDiceSides.add(roll2.randomSideUp)
        listOfDiceSides.add(roll3.randomSideUp)
        listOfDiceSides.add(roll4.randomSideUp)
        listOfDiceSides.add(roll5.randomSideUp)

        //store the list after remove the duplicate values
        var listOfDistinctSides = listOfDiceSides.distinct()

        //after removing the duplicate values if the length is equal to 1 then we stop the loop
        if(listOfDistinctSides.size == 1){
            isDistinct = false
        }
        //clear the list to add new element when the loop starts
        listOfDiceSides.clear()
    }

    //display the number of rolls
    println("\nYAHTZEE! It took $numberOfRolls rolls\n")
}