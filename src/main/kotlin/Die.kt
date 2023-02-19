

import kotlin.random.Random

class Die {
    //define variables
    var name : String = ""
    var noOfSides : Int = 0
    var randomSideUp : Int = 0

    //primary constructor with zero arguements
    constructor(){
        name = "d6"
        noOfSides = 6
        roll()
    }

    //secondary constructors
    //takes the number of sides value from the user
    constructor(noOfSides: Int): this(){
        this.noOfSides = noOfSides
        this.name = "d${noOfSides}"
        roll()
    }

    //takes both name and number of sides from the user
    constructor(name: String, noOfSides: Int): this(){
        this.name = name
        this.noOfSides = noOfSides
        roll()
    }

    //prints the result of the random side up
    fun printResult(){
        println("Creating a $name....")
        println("The current side up for $name is $randomSideUp")
    }

    //tests the roll method
    fun testRoll(){
        println("Rolling the $name...")
        roll() //called to test roll method
        println("The new value is $randomSideUp")
    }

    //calculate the highest value of the dice
    fun highestValue(){
        var isHighest: Boolean = false
        println("\nSetting the $name to show $noOfSides...")
        while (!isHighest){
            roll()
            if (randomSideUp == noOfSides){
                println("The side up is now $randomSideUp.\n")
                isHighest = true
            }
        }
    }

    //provides random value to ramdomSideUp
    fun roll(){
        randomSideUp = Random.nextInt(1, noOfSides+1)
    }
}