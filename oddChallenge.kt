fun main(){
   println( filterOdd(listOf(1,3,6,8,7)))

}
fun filterOdd(list: List<Int>): List<Int> {
    var res = listOf<Int>()
    for(i in list){
        if(i%2==1){
            res+=i
        }
    }
    return(res)



}