// 코틀린이 자바와 다른점!
// 1. 파일이름과 클래스 이름이 달라도 상관 없다.
// 2. 한 파일에 여러개의 클래스도 가능하다.


// 클래스 정의하는 방법
// 클래스 안에는 프로퍼티 / 메소드가 들어간다. (너무당연..)
class Human  {

    // 프로퍼티
    val userName: String = "우끼끼"

    fun eatingCake() {
        println("오우 너무 마시써~~")
    }
}

// 생성자를 정의한 클래스!!
// 만약 프로퍼티 값을 객체를 생성할 때 하고 싶다면? 생성자(constructor)가 필요하다!

// init 도 잘 알아두어야 한다. -> init
// 생성자( (val userName: String = "디폴트 종드로이드임미다") ) 에서 코드블럭을 넣을 수 없다.
// 코드 블럭을 넣고 싶을 때 init을 사용한다.

class ConstHuman constructor(val userName: String = "디폴트 종드로이드임미다") {

    // **인스턴스를 생성할 때** (진짜중요) 어떤 동작을 하고 싶은지 선언한다
    // 즉 인스턴스(val 어쩌구 = 클래스명()) 생성하는 시점에 가장 먼저 사용되는 녀석
    init {
        println("나는 init 이라구 해용")
    }

    fun human() {
        println("eat cake!!!")
    }
}
// 객체를 생성할 때 프로퍼티를 넣고 싶기 때문에 constructor 사용

class Car constructor(val carName: String)  {

    // 부 생성자
    // this의 의미는 주 생성자 carName으로 부터 상속을 받아온다.(필수 요소임)
    constructor(carName: String, age: Int) : this(carName) {
        println("my name is $carName, $age years old")
    }

    // val carName: String = carname
    // 이렇게 쓸 수 있지만, 이 내용을 class 생성할 때 constructor에 다 넣을 수도 있음

    // [차이점] 꼭 자세히 읽기
    // 1. 컨스트럭트에 디폴트 값이 있다면 생성자를 생성할 때 값을 주지 않아도 된다.
    // 2. 하지만 컨스트럭트에 지금처럼 디폴트 값이 없다면 생성자 생정하는 시점에 값을 주어야 한다. -> 61라인

    fun stop() {
        println("브레이크 밟았습니다 주인님")
    }
}


fun main() {
    // 자바에서 객체를 만들 때는 new를 사용했지만 코틀린은 new 키워드가 없다
    val human = Human()
    // 접근은 . 연산자로 동일하다.
    human.eatingCake()

    // 프로퍼티 접근도 동일!
    println("user Name is ${human.userName}")

    // 생성자가 있는 클래스의 객체를 생성할 때 어떻게 할까?
    // 소괄호에 해당 값을 넣어주면 된다. (안 넣으면 에러 발생)
    // 근데 이렇게 디폴트 값을 주지 않고, 상단 클래스에서 디폴트 값을 줄 수도 있다.
    val consuHuman = ConstHuman("Jongdroid")

    println(consuHuman.userName)

    // 디폴트 값 주지 않은 버전
    val nondefalut = ConstHuman()

    println(nondefalut.userName)

    // 두번째 생성자
    val secondClass = Car(carName = "테슬라")
    secondClass.stop()
    println(secondClass.carName)

    // 주 생성자 부 생성자 활용
    val subConstructor = Car("태슬라",  55)


}