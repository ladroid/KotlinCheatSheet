# KotlinCheatSheet
It's a Kotlin Cheat Sheet

**Print to Console**

```kotlin
println("Hello, world!")
```

**Constants and Variables**

```kotlin
val a = 5
var a = 7
```

**If statement(Elvis statement)**

```kotlin
val persons = listOf(Person("Alice"), Person("Bob", age = 29))
val oldest = persons.maxBy {it.age ?: 0}//if age>0 ? a : b
println("The oldest is: $oldest")
```

```kotlin
val length = text?.length
```

**Making function**

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

**Enum**

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

**Enum and when(switch(**

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

**Class**

```kotlin
class Persons(val name: String) {
    open var age: Int = 12

    override fun toString(): String {
        return "Person is $name $age"
    }
}
```

**Override classes**

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

**Abstract class**

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

**Implement interface**

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

**Getter and Setter**

```kotlin
///////////////////////////////////////////////
//data class
data class Person(val name: String, val age: Int? = null)

data class Planes(val name: String, val speed: Int)
```
