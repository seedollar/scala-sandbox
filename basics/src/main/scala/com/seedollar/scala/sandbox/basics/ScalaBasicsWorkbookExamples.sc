// ===================================================
// Anonymous function
// ===================================================
val addNumbers = (num1: Int, num2: Int) => num1 + num2
println(addNumbers(5,6))

// ===================================================
// Method definition
// ===================================================
def square(num: Int): Int = num * num
println(square(2))

// ===================================================
// class definition
// ===================================================
class Credentials(username: String, password: String) {
  val userName = username
  val passwd = password

  def blacklisted(username: String): Boolean =
    username == "john"

  def getUserName():String =
    userName

}

val credentials = new Credentials("rick", "kcir")
println(credentials.blacklisted("john"))
println(credentials.blacklisted("eric"))
println(credentials.getUserName())

