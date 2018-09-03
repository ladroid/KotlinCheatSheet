import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.launch

/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

///////////////////////////////////////////////
//override
open class Persons(val name: String) {
    open var age: Int = 12

    override fun toString(): String {
        return "Person is $name $age"
    }
}

class Driver(name:String): Persons(name) {
    override var age: Int = 15

    override fun toString(): String {
        return "Person is $name $age"
    }
}


///////////////////////////////////////////////
//abstract class
open abstract class BaseTamplate {

    var count = 0;

    fun plus() {
        count++;
        println("Count is $count");
    }
    abstract fun minus()
}

class ATamplate : BaseTamplate() {
    override fun minus() {
        count--;
    }
}


///////////////////////////////////////////////
//implement interface
interface MyInterface {
    fun f1()

    fun f2() {
        println("Hello")
    }
}

class A : MyInterface {
    override fun f1() {
        println("class A")
    }
}

class B : MyInterface {
    override fun f1() {
        println("class B")
    }
}


///////////////////////////////////////////////
//enum
enum class Colors(val Hex: String, val opacity: Double? = 1.0) {
    WHITE("#0000"),
    RED("#1f1f1f", 0.4),
    GREEN("#green"),
    BLUE("#blue", 0.5);

    fun some() {
        println("Hola")
    }
}


///////////////////////////////////////////////
//enum and when
enum class Cars {
    AUDI,
    MERCEDESS,
    BMW,
    VOLKSWAGEN,
    VOLVO
}
fun showing_enum (cars: Cars) = when(cars) {
    Cars.AUDI -> "AUDI"
    Cars.MERCEDESS -> "MERCEDESS"
    Cars.BMW -> "BMW"
    Cars.VOLKSWAGEN -> "VOLKSWAGEN"
    Cars.VOLVO -> "VOLVO"
    else -> "None"
}

fun showing_when_example () {
    var a = 7
    var b = 6
    when {
        (a > b) -> println("$a > $b = true")
        (a < b) -> println("$a < $b = true")
        (a == b) -> println("$a == $b = true")
    }
}
///////////////////////////////////////////////

/*
WORKING WITH ARRAYLIST, LIST, MAP
 */
///////////////////////////////////////////////
fun javas_classes() {
    /////////////////////////////////
    //////////ARRAYLIST
    val arraylist = ArrayList<Int>()
    arraylist.add(1)
    arraylist.add(2)
    arraylist.add(3)
    arraylist.add(4)
    arraylist.add(5)
    arraylist.add(6)

    println()
    println(arraylist)

    arraylist.remove(3)
    println(arraylist)

    println(arraylist.get(4))
    /////////////////////////////////
    //////////MAP
    val map = mapOf<Int,String>(1 to "Jhon", 2 to "Kevin", 3 to "Elvin", 4 to "Steve")
    println(map)
    println(map.getValue(1))
    println(map.keys)

    /////////////////////////////////
    //////////LIST
    val list = listOf<Int>(1, 2, 3, 4, 5, 6)
    println(list)
}

///////////////////////////////////////////////

/*
FUNCTION AND ALL TYPES OF FUNCTION
 */
///////////////////////////////////////////////
fun sum1(a: Int, b: Int): Int {
    return (a+b)
}

///////////////////////////////////////////////
fun sum2(a: Int, b: Int) = a + b;

///////////////////////////////////////////////
fun printSum1(a: Int, b: Int): Unit {
    println(a+b)
}

///////////////////////////////////////////////
fun printSum2(a: Int, b: Int) {
    println(a+b)
}

///////////////////////////////////////////////
//making array and work with loop + for each
fun array() {
    val arr = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7)
    println("For Example")
    for(i in 0 .. arr.size - 1)
        print(arr[i])

    println()
    println("ForEach Example")

    arr.forEach { print(it) }
}

fun array2() {
    var array = Array(5, { i -> (i + 1).toString()})
    array.forEach { println(it) }
}

///////////////////////////////////////////////
//making list Immutable, Mutable
fun list() {
    val list_imm = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(list_imm)

    val list_mut = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7)
    println(list_mut)
    list_mut.add(8)
    println(list_mut)

    list_mut.removeAt(0)
    println(list_mut)
}

///////////////////////////////////////////////
//Set
fun set() {
    val set = setOf<Int>(1, 3, 5)
    println(set)
}

///////////////////////////////////////////////
//data class
data class Person(val name: String, val age: Int? = null)

data class Planes(val name: String, val speed: Int)

///////////////////////////////////////////////
//Exception
fun exception() {
    val number = 200
    if(number !in 0..100) {
        throw IllegalArgumentException("A number must be between 0 and 100: $number")
    }
    else {
        println("$number")
    }
}

fun main(args: Array<String>) {
    println("Hello, world!")

    println()

    val a = 5
    val b = 6
    val c: Int = a + b
    println("Result " + c)
    println(sum1(4,5))
    println(sum2(4, 5))

    printSum1(4, 5)
    printSum2(4, 5)

    println()
    ///////////////////////////////////////////////
    /////if-else
    if(a > b)
        println("$a > $b")
    else
        println("$a < $b")
    ///////////////////////////////////////////////

    println()

    ///////////////////////////////////////////////
    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
    val oldest = persons.maxBy {it.age ?: 0}//if age>0 ? a : b
    println("The oldest is: $oldest")
    println(Planes("Boeing-744", 800))
    ///////////////////////////////////////////////

    println()

    println(Colors.RED)
    println(Colors.RED.Hex)
    println(Colors.RED.opacity)
    Colors.RED.some()

    println()
    println(showing_enum(Cars.BMW))

    println()
    showing_when_example()

    println()
    var fun1 : MyInterface = A()
    var fun2 : MyInterface = B()
    fun1.f1()
    fun2.f1()

    println()
    var v1 : BaseTamplate = ATamplate()
    v1.plus()
    v1.minus()
    v1.plus()

    println()
    println(Persons("Alex"))
    println(Driver("Alex"))

    println()
    array()

    println()
    array2()

    println()
    javas_classes()

    println()
    list()

    println()
    set()

    ///////////////////////////////////////////////
    //coroutines
    println("Kotlin Start")
    launch(CommonPool) {
        println("Kotlin Hello")
    }
    println("Kotlin End")


    println()
    exception()
}