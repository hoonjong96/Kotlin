/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2022/12/25
 * @desc
 */

// 오늘 배울 개념 [상속]
// 코틀린의 클래스는 기본적으로 final 클래스다. 같은 파일 내에 있더라도 그냥 접근은 못한다.
// open 을 메인 클래스에 해주어야 함

open class Country {

    init {
        println("Country 클래스의 init 입니당")
    }

    val money: Int = 555555888

    open fun work() {
        println("열심히 일을 해야죱..")
    }

}

// 오버라이딩 개념!!
// 부모의 클래스를 자식에게 덮어씌운다.
// 즉, 상속 받은 메서드를 korean 클래스에서 조금 다르게 사용하고 싶을 때

class Korean : Country() {
    // 자바라면 이렇게만 해도 오버라이드가 되어야 하지만 똑같이 오픈을 해주어야 한다.
//    override fun work() {
//
//    }
    override fun work() {
        super.work() // 부모 클래스에 메서드도 사용한다!
        println("한쿡 사람은 빨리빨리 일해요")

    }
    // 만약에 부모 클래스에 메서드도 사용하고 싶다면?
    // super 를 쓰면 된다.
}

fun main() {
    val korean = Korean()
    // 부모로 부터 상속을 받았기 때문에 부모 클래스에 있는 메서드를 받아올 수 있다.
    korean.work()
}