fun main () {
    val name = "noah"
    println(name)
    println(capitalize(name))
    /*
    1. Ask for player name


    2. Make random stats


    3. Fight.

    make functions that print out what happens (ex: fight dragon) and change health
    also make functions that heal



    4. Print final stats

    make a list/array of all the things you want to print and print them via iteration

     */
}

/*
class Player(_name: String, _health: Int, _isBlessed: Boolean) {
    var health = _health
    val blessed = _isBlessed

    val name = _name

}
*/
fun capitalize(str: String): String {
    val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
    val upperAlphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val new_string = mutableListOf<Char>()
    for (letter in str) {
    	if (letter in alphabet){
        	new_string.add(upperAlphabet[alphabet.indexOf(letter)])
    	}
        else {
        	new_string.add(letter)
        }
    }
    return new_string.joinToString("")
}
