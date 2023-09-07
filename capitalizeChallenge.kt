fun main() {
    println( capitalizeSentence("my Name is mohamed"))

}

fun capitalizeSentence(str: String):String {
    var res = ""
    res += str[0].uppercaseChar()
    for (i in 1..str.length-1) {
        if (str[i] == ' ') {
            res+=' '
            res+=str[i+1].uppercaseChar()
        }
        else if(str[i-1]!=' '){
            res+=str[i]
        }

    }
    return res
}
