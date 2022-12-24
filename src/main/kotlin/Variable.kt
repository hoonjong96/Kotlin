fun main(array: Array<String>) {

    var userName: String = "HoonJong" //  // 유저의 이름을 저장할 변수
    val userSpeed: Int = 300     // val 은 Java에서의 final(상수)로 값을 변경할 수 없습니다.

    val count = 15 // 다음과 같이 데이터 타입을 명시하지 않아도 추론할 수 있다. (타입 추론)
    var myName = "Jongdroid" // var 도 마찬가지

    val upparcase = userName.toUpperCase() // String에서만 호출할 수 있는 함수
    println("소문자: $userName")
    println(count.inc()) // inc 함수는 Int 연산자 함수로서 Int에서만 사용할 수 있으며 기존 값에 +1을 해준다.
    println("대문자: $upparcase")

    // 당연하지만 초기화를 하지 않고 출력을 하려고 들면 당연히 에러가 발생한다.
    var e: String
    e = "안뇽"

    println(e)


}

