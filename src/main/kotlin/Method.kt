fun main() {
    helloWorld()

    println(add(3,4))

}

// 1. 함수

// 코틀린은 fun 키워드를 사용한다.
// 리턴형이 없으면 Unit을 써줘야 하는데 없어도 상관은 없다. (void와 같은 개념)
fun helloWorld(){
    println("나 helloWorld 함수야")
}

// return 타입을 생략할 수 없다. 왜냐면 return 하는 값이 있기 때문
fun add(a: Int, b: Int) : Int {
    return a + b
}