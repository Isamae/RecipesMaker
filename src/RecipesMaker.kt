fun main(args:Array<String>){
    var opcion:String? = "0"
    while(opcion !="3" ){
        menu()
        opcion= readLine()
        when(opcion){
            "3" -> println("Saliendo")
            "2" -> println("Viendo Recetas")
            "1" -> println("Haciendo Receta")
            else -> println("Opción Equivocada")
        }
    }
}
fun menu(){
    println("""             
        :: Bienvenido a Recipe Maker ::
          Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""")
}