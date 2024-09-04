interface Shape{
    fun area():Double
}
open class Rectangles(val a:Double,val b:Double):Shape{
    override fun area():Double{
        return a*b
    }
    open fun display(){
        println("Area of rectangle with dimension $a and $b is ${area()}")
    }
}

class Squares(side:Double):Rectangle(side,side){
    override fun display() {
        println("Area of square with side $a is ${area()}")
    }
}

fun main(){
    val myRectangle=Rectangles(4.0,5.0)
    myRectangle.display()
    val mySquare=Squares(3.0)
    mySquare.display()
}
