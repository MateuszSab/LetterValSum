import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should


class LetterValSumSpec extends AnyFlatSpec with should.Matchers {

  "LetterValSumSpec" should "Given a string of lowercase letters, " +
                              "find the sum of the values of the letters in the string." in {
    import LetterValSum._
    sumLetters("abc") shouldBe 6
    sumLetters("zd") shouldBe 30
    sumLetters("") shouldBe 0
  }

}
