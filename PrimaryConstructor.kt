class Persons(var name:String,var age:Int){    //Primary Constructor
    constructor(x:String):this(){              //Secondary Constructor
        this.name=x
        this.age=0
    }
    constructor():this("Rahul",50)
    fun intro(){
        println("My name is $name and age $age")
    }
}

fun main(){
    var a=Persons("Riya",22)
    a.intro()
    var b=Persons()
    b.intro()
    var c=Persons("Heeana")
    c.intro()
}