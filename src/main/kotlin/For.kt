// 반복문의 종류 : for, while

fun main() {
    printStar()
    formoon()
    whileMoon()
}

fun printStar() {

    val myArray = arrayOf<Int>(2, 5, 20, 25, 45)

    for (index in 0..myArray.size) {
        println("index 값이용 : $index")
        println(myArray[index])

    }



    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
    println("===========================================")

    for (a in 5 downTo 1) {
        for (b in 1..a) {
            print("*")
        }
        println()
    }
    println("===========================================")
}


fun formoon() {

    val students = arrayListOf<String>("Hoonjong", "jongdroid", "Baegopa", "Happy", "Kind")

    // swift 랑 유사해보임!!
    // students의 원소들을 하나씩 임시변수(name)에 가져온다.
    for (name in students) {
        println("${name}")
    }

    var sum: Int = 0
    for (i in 1..10) {
        sum += i
        println(i)
    }
    println(sum)

    // 스텝을 넣을 수도 있음, 2칸씩 이동해라
    // 당연히 초기값이 홀수면, 9에서 끝나고, 0이면 10까지 간 이후 끝
    for (i in 1..10 step 2) {
        println("2칸씩 이동중입니다예 $i")
    }

    for (i in 10 downTo 1) {
        println("10부터 1까지 한개씩 내려볼게예 $i")
    }

    for (i in 1 until 10) {
        println("1부터 9까지만 출력할게요")
    }
}

fun whileMoon() {

    var index: Int = 0
    while (index <= 10) {
        println("current Index: $index")
        index++
    }

}