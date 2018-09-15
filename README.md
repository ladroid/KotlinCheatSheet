# KotlinCheatSheet
It's a Kotlin Cheat Sheet

### Print to Console

```kotlin
println("Hello, world!")
```

### Constants and Variables

```kotlin
val a = 5
var a = 7
```

### Arithmetic Operations

```kotlin
val a = 12
val b = 4
println("Arithmetic operations")
println(a shl b) //shift left
println(a shr b) //shift right
println(a ushr b)
println(a and b) //AND operation
println(a or b) //OR operation
println(a xor b) //XOR operation
```

### If-else statement

*if-else*

```kotlin
if(a > b)
        println("$a > $b")
    else
        println("$a < $b")
```

*Elvis statement*

```kotlin
val persons = listOf(Person("Alice"), Person("Bob", age = 29))
val oldest = persons.maxBy {it.age ?: 0}//if age>0 ? a : b
println("The oldest is: $oldest")
```

*if value is null*

```kotlin
val length = text?.length
```

### Try-catch

*Example1*

```kotlin
fun readNumber(reader: String): Int? {
    try {
        val e = reader.toInt()
        return e
    } catch (e: NumberFormatException) {
        return null
    }
}
```

*Example2*

```kotlin
fun readNumber2(reader: String): Int? {
    val number = try {
        return reader.toInt()
    } catch (e: NumberFormatException) {
        return null
    }
    return number
}
```

### Exception

```kotlin
fun exception() {
    val number = 200
    if(number !in 0..100) {
        throw IllegalArgumentException("A number must be between 0 and 100: $number")
    }
    else {
        println("$number")
    }
}
```

### Making array

*Example 1*

```kotlin
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
```

*Example 2*

```kotlin
fun array2() {
    var array = Array(5, { i -> (i + 1).toString()})
    array.forEach { println(it) }
}
```

*Example3*

```kotlin
fun array3() {
    val arr = IntArray(6) {it + 1}
    println("Array 3")
    arr.forEach { println(it) }
}
```

**Multidemesinal Array**

*Example1*

```kotlin
fun array4_multidemesinal() {
    val array = arrayOf(intArrayOf(1, 2),
            intArrayOf(3, 4),
            intArrayOf(5, 6, 7))

    println(Arrays.deepToString(array))
}
```

*Example2*

```kotlin
fun array5_multidemesinal() {
    var num = 100

    // Array Initialization
    var twoDArray = Array(4, {IntArray(3)})
    for(i in 0..twoDArray.size - 1) {
        var rowArray = IntArray(3)
        for(j in 0..rowArray.size - 1) {
            rowArray[j] = num++
        }
        twoDArray[i] = rowArray
    }

    // Array Value Printing
    for(row in twoDArray) {
        for(j in row) {
            print(j)
            print(" ")
        }
        println("")
    }
}
```

### Making function

```kotlin
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
```

### Enum

```kotlin
enum class Colors(val Hex: String, val opacity: Double? = 1.0) {
    WHITE("#0000"),
    RED("#1f1f1f", 0.4),
    GREEN("#green"),
    BLUE("#blue", 0.5);

    fun some() {
        println("Hola")
    }
}
```

### Enum and when(switch)

```kotlin
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
```

### Class

```kotlin
class Persons(val name: String) {
    open var age: Int = 12

    override fun toString(): String {
        return "Person is $name $age"
    }
}
```

### Override classes

```kotlin
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
```

### Abstract class

```kotlin
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
```

### Implement interface

```kotlin
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
```

### Getter and Setter

```kotlin
///////////////////////////////////////////////
//data class
data class Person(val name: String, val age: Int? = null)

data class Planes(val name: String, val speed: Int)
```

### ArrayList, List, Map

```kotlin
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
```

### List Immutable and Mutable

```kotlin
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
```

### Clone object

```kotlin
open class CloningA : Cloneable {
    open val s = "Hello"

    override public fun clone() : Any {
        return super.clone()
    }
}

fun combine() {
    val tempa = CloningA()
    println(tempa) //address
    val tempb = tempa.clone() //making new address
    println(tempb.toString())
}
```

### Copy object

```kotlin
data class User(val name: String = "", val age: Int = 0)

fun copying() {
    val jack = User(name = "Jack", age = 1)
    println(jack)
    val olderJack = jack.copy(age = 2) //copy
    println(olderJack)
}
```

### Coroutines

```kotlin
///////////////////////////////////////////////
//coroutines
println("Kotlin Start")
launch(CommonPool) {
println("Kotlin Hello")
}
println("Kotlin End")
```

### Web Server

```kotlin
fun start() {
    var vertx = Vertx.vertx()
    var server = vertx.createHttpServer().requestHandler({httpServerRequest ->
        httpServerRequest.response().end("Hello Vert.x") }).listen(8080,
            {asyncResult -> if(asyncResult.succeeded()) {
                println("It works!!!")
            } else {
                println("Does not work!!!")
            }})

}

fun main(args: Array<String>) {
    start()
}
```
