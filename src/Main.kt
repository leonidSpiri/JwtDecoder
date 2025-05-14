import data.Jwt

fun main() {
    val jwt =
        Jwt(token = "")
    println(jwt.isExpired())
    println(jwt.getUserData().sub)
    println(jwt.getUserData().role)
    println(jwt.getUserData().exp)
    println(jwt.getUserData().teams?.get(0))
}