fun main(args:Array<String>){
    var opcion:String? = "0"
    while(opcion !="3" ){
        opcion= menu()
        when(opcion){
            "3" -> println("Saliendo")
            "2" -> viewRecipe()
            "1" -> makeRecipe()
            else -> println("Opción Equivocada")
        }
    }
}
fun makeRecipe():String?{
    println("""             
            Hacer receta
    Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites""")
    var opcion:String? = readLine()
    return  opcion
}
fun viewRecipe(){
    println("Viendo Recetas")
}
fun menu():String?{
    println("""             
        :: Bienvenido a Recipe Maker ::
          Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""")
    var opcion:String? = readLine()
    return opcion
}
