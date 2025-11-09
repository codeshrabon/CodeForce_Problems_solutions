import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    print("Test number: ")
    val test = sc.nextInt()

    for (i in 0 until test) {
        print("Array size: ")
        val sizeOfArray = sc.nextInt()

        val arrayInt = IntArray(sizeOfArray)
        for (j in 0 until sizeOfArray) {
            arrayInt[j] = sc.nextInt()
        }

        println("Index of the array: ")
        for (j in 0 until sizeOfArray) {
            var count = 0
            for (k in 0 until sizeOfArray) {
                if (arrayInt[j] == arrayInt[k]) {
                    count++
                }
            }

            if (count == 1) {
                println(j + 1) // 1-based index
                break
            }
        }
    }
}
