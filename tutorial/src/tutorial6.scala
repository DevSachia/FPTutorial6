

object tutorial6 {
  def main(args: Array[String]) {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    def encrpt(alp: String, msg: String , shift: Int): Unit = {
      val outputText = msg.map((c: Char) => {

        //We find the c char in our allowed alphabet
        val x = alp.indexOf(c.toUpper);

        //If the c char is in our alphabet then we encrypt it
        //If it is not then we leave it be.
        if (x == -1) {
          c
        } else {
          alp((x + shift) % alp.size);
        }
      });
      println(outputText);
    }

    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size
    val inputText = scala.io.StdIn.readLine("Secret Message: ");
    
    //calling the encript function
    
    encrpt(alphabet,inputText,shift);

  }
}