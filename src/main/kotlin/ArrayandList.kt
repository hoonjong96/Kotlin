import java.util.*

fun main() {
    //  배열과 리스트는 큰 차이점이 있다. Array and List
    //  Array는 정해진 사이즈가 있고, 이미 메모리가 할당되어서 나오기 때문에 처음 크기를 지정해주어야 한다.
    //  List는 1. List(수정불가) 2. MutableList(수정가능)

    var myArray: Array<String> = arrayOf("Jongdroid", "Happy", "Nice")

    println(myArray.size) // 배열의 크기 반환
    println(myArray.reversed()) // 거꾸로 뒤집은 배열 반환

    println(myArray.contains("Jongdroid")) // 특정 원소가 배열에 포함하는지 boolean 값 반환
    println(myArray.sorted()) // 오름차순 정렬
    println(myArray.sortedDescending()) // 내림차순 정렬

}

fun array() {
    // 각각 arrayOf, listOf로 초기화를 할 수 있다.
    // array는 기본적으로 mutable이다. = 값을 바꿀 수 있다.

    // 하지만 list는 기본적으로 읽기 전용으로 값 변경이 불가능하다.
    // Mutablelist는 읽기 쓰기 모두 가능하다.
    val array: Array<Int> = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2: Array<Any> = arrayOf(1, "hi", 145.5)

    array[0] = 3
    // list[0] = 1 값 변경 불가 (컴파일 오류)

    // MutableList의 가장 대표적인 예는 arrayList이다.
    // 주소 관련된 부분 더 공부필요**
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)

    // 여기서 var val의 개념이 헷갈릴법하다.
    // 계속 값을 추가하기 때문에 당연히 var을 써야하는거 아니야? 라는 생각을 할 수 있는데
    // arrayList의 참조값 자체는 변하지 않는다.
    // lista listb 가 있을때 arrayList는 lista를 바라보지, listb를 바라보는 건 아니다.
    // 쉽게 말해서, 주소 값이 바뀌지 않으니까 val을 써도 된다.
    // 1.철수의 집 주소 2.영희의 집 주소 --> 이사를 가지 않는 한, 학교를 가던, 외출을 하던, 주소 값이 바뀌지 않는다.

    // 하지만 이런 경우가 있다. 새롭게 arrayList = arrayListOf 할당하는 경우!!
    // 이사를 가는 거라고 생각하면 된다. 이런 경우는 당연히 var 을 써야 할 것이다.
 


}