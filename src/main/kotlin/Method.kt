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

// 코틀린만의 매력!! Nullable vs Nonnull
// NPE: Null Pointer Exception 자바를 하면서 정말 많이 만나는 나쁜 뇨속중 하나이다
// 근데 또 이놈이 자바에서 컴파일 시점에 잡히는게 아니라 런타임에 잡혀서 좀 나쁘다 !
// 근데 코틀린은 컴파일 시점에 잡아줄게 대신 ? 좀 써줘 .
fun nullcheck() {

    // 이렇게 ? 가 없으면 Nonnull 타입으로, null이 있으면 안되는 타입이다.
    var name: String = "Jongdroid"

    // 이렇게 사용해야 nullable 타입이 된다.
    var nullname: String? = null
}