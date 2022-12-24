// 조건식
fun main() {
    maxBy(15, 13)
    checkNum(1)
}

fun maxBy(a: Int, b: Int) : Int {

    if (a > b) {
        return a
    } else {
        return b
    }

}

// 이렇게 축약해서 표현할 수 있다.
// a or b 라는 값을 만들어낸다. -> Expression
fun maxBy2(a: Int, b: Int) : Int = if(a>b) a else b

// when은 다른언어의 Switch 역할을 한다.
// (1)또 여기서 when은 뭔가 값을 만들어주는 역할이 아니기 때문에 statement로 쓰였다.
fun checkNum(score: Int) {
    when(score) {
        0 -> println("this is zero")
        1 -> println("this is $score")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know well.")
    }
    // 이런식으로 리턴을 when으로 사용할 수 있으며 when은 필수적으로 else가 있어야 한다.
    //(2) 하지만 여기서 when은 1 or 2 or 0 이라는 값을 return해서 Expression.
    var b: Int = when(score) {
        1 -> 1
        2 -> 2
        else -> 0
    }

    println("b: $b")

    when(score) {
        in 90..100 -> println("Wow good!!!")
        in 10..80 -> println("not bad")
        else -> println("Don't worry")

    }
}

// Expression vs Statement
// 코틀린에서 모든 함수는 Expression 이다. (리턴 값이 없어도 Unit을 반환한다)
// Expression -> 뭔가 뚱땅뚱땅해서 값을 반환하는 경우
// Statement -> 이렇게 해, 명령을 지시하는 경우.
// (이 두 차이 조금 더 학습 필요하다)