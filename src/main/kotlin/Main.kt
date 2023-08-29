fun main() {
    var opc: Int

    val monedas20 = arrayListOf<String>()
    val monedas50 = arrayListOf<String>()
    val monedas100 = arrayListOf<String>()
    val monedas200 = arrayListOf<String>()
    val monedas500 = arrayListOf<String>()

    do{
        println("""
            Menu de la Alcancia
            1. Ingresar moneda de $20
            2. Ingresar moneda de $50
            3. Ingresar moneda de $100
            4. Ingresar moneda de $200
            5. Ingresar moneda de $500
            6. Informacion de monedas almacenadas 
            7. Total de dinero ahorrado 
            8. Vaciar alcancia 
            9. Salir
        """.trimIndent())
        opc = readln().toInt()


        when(opc){
            1 -> {
                println("__________________________________________")
                println("Cuantas monedas de 20 desea ingresar")
                var cant = readln().toInt()
                for (i in 1..cant){
                    monedas20.add("20")
                }
                println("__________________________________________")
            }
            2 -> {
                println("__________________________________________")
                println("Cuantas monedas de 50 desea ingresar")
                var cant = readln().toInt()
                for (i in 1..cant){
                    monedas50.add("50")
                }
                println("__________________________________________")
            }
            3 -> {
                println("__________________________________________")
                println("Cuantas monedas de 100 desea ingresar")
                var cant = readln().toInt()
                for (i in 1..cant){
                    monedas100.add("100")
                }
                println("__________________________________________")
            }
            4 -> {
                println("__________________________________________")
                println("Cuantas monedas de 200 desea ingresar")
                var cant = readln().toInt()
                for (i in 1..cant){
                    monedas200.add("200")
                }
                println("__________________________________________")
            }
            5 -> {
                println("__________________________________________")
                println("Cuantas monedas de 500 desea ingresar")
                var cant = readln().toInt()
                for (i in 1..cant){
                    monedas500.add("500")
                }
                println("__________________________________________")
            }
            6 -> {
                println("__________________________________________")
                println("Informacion de monedas almacenadas")
                println("Cantidad Monedas de 20: " + monedas20.size)
                println("Cantidad Monedas de 50: " + monedas50.size)
                println("Cantidad Monedas de 100: " + monedas100.size)
                println("Cantidad Monedas de 200: " + monedas200.size)
                println("Cantidad Monedas de 500: " + monedas500.size)
                println("__________________________________________")
            }
            7 -> {
                println("__________________________________________")
                println("Total de dinero ahorrado")
                var totalDinero = ((monedas20.size * 20)+(monedas50.size * 50)+(monedas100.size * 100)+(monedas200.size * 200)+(monedas500.size * 500))
                println("Ahorro total en la Alcancia: $totalDinero")
                println("__________________________________________")
            }
            8 -> {
                println("__________________________________________")
                println("Vaciando la alcancia")
                monedas20.clear()
                monedas50.clear()
                monedas100.clear()
                monedas200.clear()
                monedas500.clear()
                println("__________________________________________")
            }
        }
    }while (opc != 9)
}