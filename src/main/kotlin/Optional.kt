fun main(array: Array<String>) {

    // 다른 언어에서는 다음과 같이 값을 초기화 하지 않아서 다음과 같이 null을 포함시킬 수 있지만 코틀린은 이를 불허한다.
    // 다음과 같은 코드는 에러를 만드는 코드다.
    // val myName: String = null

    // 코틀린은 언어의 안정성을 위해 null 값을 포함하는 변수는 nullable 유형이어야 하며, 이를 ? 접미사로 표현할 수 있도록 제공한다.
    // 이를 통해 값이 있을수도 없을수도 있음을 표현한다.
    val myName: String? = null
    println(myName)

    // 하지만 nullable 변수는 신중하게 처리해야 한다. 가령 자바에서는 null 값을 담은 변수를 호출하려고 하면 비정상 종료가 발생한다.

    // myName에 값이 없다면 ?: 뒤에 값을 꺼낸다. (스위프트 ?? 개념)
    val checkUserName: String = myName ?: "값이 있네요!"
    println(checkUserName)

    // 비슷한 개념으로 myName에 값이 없으면 가보자잇 출력
    val someValue: String = myName.let {
        it
    }?: "가보자잇"
    println("some Value: $someValue")

    val a = "Kotlin"
    val b: String? = "하윙"

//    println(b?)
    println("${a.length}")

    var upperString: String? = null

//    println("${upperString.toUpperCase()}")

    var testString = upperString?: "해윙"
    println("testString: $testString")
}