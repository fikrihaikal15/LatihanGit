class BilanganPrima(private val angka : Int) {
    fun prima(): Boolean {
        if (angka <= 1) {
            return false
        }

        for (i in 2..angka / 2) {
            if (angka % i == 0) {
                return false
            }
        }
        return true
    }
}