fun main(){
    println( getAllPairs(2) )

}
fun getAllPairs(n: Int): List<Pair<Int, Int>> {
    var res = mutableListOf<Pair<Int,Int>>()
    for (i in 0..n){
        for(j in 0..n)
            res+=(i to j)
    }
    return res

}