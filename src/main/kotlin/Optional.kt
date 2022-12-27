fun main(array: Array<String>) {
    // 옵셔널 -> 노션에 정리 필요


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

    // * 중요한 개념 **

    var userName: String? = null

    // var usernameUpperCase = userName.toUpperCase()
    // 이러면 에러가 발생한다. -> userName이 null인지 null이 아닌지 몰라서 예를 사용할 수 있는지 모르겠어.

    // 이런 경우는 물음표를 붙이면 된다.
    // ? 를 붙이는 의미는 만약 userName이 null이 아니면 함수를 실행하고, 그게 아니면 userName.toUpperCase() 자체를 null로 반환한다.
    // 스위프트의 옵셔널 바인딩 느낌
    var usernameUpperCase = userName?.toUpperCase()
    println(usernameUpperCase)

    // ?: 엘비스 연산자 -> 엘비스 프레슬리 헤어 닮아서 엘비스 ㅋㅋ
    // 위에서는 바로 null을 반환했다면, 이 친구는 디폴트 값을 설정할 수 있다.

    // 값이 있어 없어? 만약 없으면 (null) 이걸로 해줭
    // userName이 null 이면 -> 아직 값이 없는 것 같아요. (디폴트 값)
    // userName에 값이 있으면 그 값을 출력한다.
    var displayUserName = "Hello" + (userName?: "아직 값이 없는 것 같아요")
    println(displayUserName)

    if (userName != null) {
        println("널이 아닙니답쇼")
    } else {
        println("널이라서 기본 값 지정할래요")
    }

    // 또 많이 사용하는 녀석으로
    // !! 가 있다. 개발자가 컴파일 시점에 "이 녀석은 하늘이 무너져도 절대 null이 아닌 걸 인지하고 있을때 컴파일러에게 !! 을 붙여서 알려준다."



}