object LetterValSum extends App {

  def sumLetters(letters: String): Int = {
    val list = Seq(' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    val letterIntMap = list.zipWithIndex.toMap
    val lettersSplit = letters.split("").flatMap(c => c.toCharArray)
    lettersSplit.foldLeft(0) { (result, l) =>
      result + letterIntMap(l)
    }
  }
}
