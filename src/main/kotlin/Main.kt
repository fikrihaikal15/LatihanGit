fun main(args: Array<String>) {
    print("Masukan Angka : ")
    val angka = readLine()?.toInt() ?: 0
    val bilanganPrima = BilanganPrima(angka)

    val hasil = if (bilanganPrima.prima()){
        println("$angka adalah bilangan prima")
    }else{
        println("$angka bukan bilangan prima")
    }
}
