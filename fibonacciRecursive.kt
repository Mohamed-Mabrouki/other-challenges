fun main(){
    println( fiboRec(7))

}
fun fiboRec(n:Int): Int{
    if(n<2){
        return n
    }
    else{
        return fiboRec(n-1)+fiboRec(n-2)
    }

}