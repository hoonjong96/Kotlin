fun main() {

    // 문자열 템플릿
    val name: String = "Jongdroid"
    val firstName: String = "Park"
    println("my name is $name + $firstName I am 21") // 달러 표시를 사용하고 문자열을 연결 할 수 있다.
    // 이런 경우도 있을 수 있다. 함수를 사용하거나 뛰어쓰기를 하고 싶지 않을 때는 ${}를 사용한다.
    println("대문자로 한번 출력해볼게요 : ${name.toUpperCase()}")
    println("뛰어쓰기 하기 싫은나는${name}25쨜입니다")


    // 만약 달러표시를 출력하고 싶다. 이스케이프를 \ 백 슬래쉬로 사용한다.
    val a: Int = 2
    println("This is ${a}\$")

}