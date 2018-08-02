fun main(args: Array<String>) {
    var num1: Double = 0.0
    var num2: Double = 0.0

    print("Digite o primeiro número: ")
    num1 = readLine()!!.toDouble()

    print("Digite a operação: (+ , - , * , / ) ")
    val op: String = readLine()!!

    print("Digite o segundo número: ")
    num2 = readLine()!!.toDouble()

    val result: Double = if (op=="+") sum(num1, num2)
                                        else if (op == "-") sub(num1, num2)
                                        else if (op == "*") mult(num1, num2)
                                        else if (op == "/") div(num1, num2)
                                        else 0.0

    println("$num1 $op $num2 = $result")
}

fun sum (num1: Double, num2: Double): Double {
    return num1+ num2
}
fun sub (num1: Double, num2: Double): Double {
    return num1 / num2
}
fun mult (num1: Double, num2: Double): Double {
    return num1 * num2
}
fun div (num1: Double, num2: Double): Double {
    return num1 / num2
}
