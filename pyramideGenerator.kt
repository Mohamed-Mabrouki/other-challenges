fun main() {
    generatePyramid(7)

}

fun generatePyramid(n: Int){
    var res = listOf<String>()
    var str = ""
    var width = 1
    for (i in 0..n - 1) {
        for (i in 0..width-1){
            str+='#'
        }
        while(str.length<n*2){
            str= " $str "
        }
        println(str)
        res+=str
        str=""
        width+=2


    }


}