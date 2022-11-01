package study

import Person
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.nulls.shouldBeNull
import io.kotest.matchers.shouldBe

// StringSpec: 문자열 기반
class PersonKoTest : StringSpec({
    "이름 붙인 인자" {
        val person = Person(name = "Son Sora", age = 29, nickname = "ssr03")

        // koTest 방식
        person.name shouldBe "Son Sora"
        person.age shouldBe 29
        person.nickname shouldBe "ssr03"
    }

    "널 타입" {
        val person = Person("Son sora", 29, null)
        person.nickname.shouldBeNull()
    }

    "기본 인자" {
        val person = Person("Son sora", 29)
        person.nickname shouldBe person.name
    }

    "데이터 클래스" {
        val person1 = Person("Son sora", 29)
        val person2 = Person("Son sora", 29)
        person1 shouldBe person2
    }
})
