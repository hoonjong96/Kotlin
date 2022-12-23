fun main(array: Array<String>) {

    var userName: String = "HoonJong" //  // 유저의 이름을 저장할 변수
    val userSpeed: Int = 300     // val 은 Java에서의 final(상수)로 값을 변경할 수 없습니다.

    val count = 15 // 다음과 같이 데이터 유형을 추론할 수 있다. (swift와 유사한 개념)

    val upparcase = userName.toUpperCase() // String에서만 호출할 수 있는 함수
    println("소문자: $userName")
    println(count.inc()) // inc 함수는 Int 연산자 함수로서 Int에서만 사용할 수 있으며 기존 값에 +1을 해준다.
    print("대문자: $upparcase")

}

