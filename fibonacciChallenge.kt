fun main() {
    println( fibo(8))

}

fun fibo(n: Int): Int {
    var f0 = 0
    var f1 = 1
    var c = 1
    if (n == 0) {
        return 0
    } else if (n == 1) {
        return 1

    } else {
        while (c < n) {
            c++

            var f2=f1+f0
            f0=f1
            f1=f2

        }
        return (f1)

    }


}