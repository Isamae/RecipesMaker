import model.Ingrediente
import model.Receta

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
fun makeRecipe():Receta{
    var receta: Receta = Receta()
    var opcion:String? = "0"
    do {
        opcion = menuIngredientes()
        when(opcion){
            "1" ->
            {   println("Ingrese la cantidad de Agua en lt")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                receta.agregarIngrediente(Ingrediente("Agua",cantidad.toInt()))
            }
            "2" ->
            {   println("Ingrese la cantidad de Leche en lt")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                receta.agregarIngrediente(Ingrediente("Leche",cantidad.toInt()))
            }
            "3" ->
            {   var op:String? = menuCarne()
                println("Ingrese la cantidad en lb")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Res",cantidad.toInt()))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Pollo",cantidad.toInt()))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Chancho",cantidad.toInt()))
                }
            }
            "4" ->
            {   var op:String? = menuVerduras()
                println("Ingrese la cantidad en lb")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Lechuga",cantidad.toInt()))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Tomates",cantidad.toInt()))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Acelga",cantidad.toInt()))
                }
            }
            "5" ->
            {   var op:String? = menuFrutas()
                println("Ingrese la cantidad ")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Fresa",cantidad.toInt()))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Plátano",cantidad.toInt()))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Uva",cantidad.toInt()))
                }
                else if(op == "4"){
                    receta.agregarIngrediente(Ingrediente("Manzana",cantidad.toInt()))
                }
                else if(op == "5"){
                    receta.agregarIngrediente(Ingrediente("Naranja",cantidad.toInt()))
                }
                else if(op == "6"){
                    receta.agregarIngrediente(Ingrediente("Pera",cantidad.toInt()))
                }
                else if(op == "7"){
                    receta.agregarIngrediente(Ingrediente("Cereza",cantidad.toInt()))
                }
            }
            "6" ->
            {   var op:String? = menuCereal()
                println("Ingrese la cantidad ")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Avena",cantidad.toInt()))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Trigo",cantidad.toInt()))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Arroz",cantidad.toInt()))
                }
                else if(op == "4"){
                    receta.agregarIngrediente(Ingrediente("Maiz",cantidad.toInt()))
                }
            }
            "7" ->
            {   println("Ingrese la cantidad de Huevos")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                receta.agregarIngrediente(Ingrediente("Huevos",cantidad.toInt()))
            }
            "8" ->
            {   var op:String? = menuAceites()
                println("Ingrese la cantidad en lt")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Oliva",cantidad.toInt()))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Palma",cantidad.toInt()))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Almendras",cantidad.toInt()))
                }
            }
        }
    }while (opcion != "9")

    return  receta
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
fun menuIngredientes():String?{
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
        8. Aceites
        9 . Terminar Receta """)
    var opcion:String? = readLine()
    return opcion
}
fun menuCereal():String?{
    println("""             
        1. Avena 
        2. Trigo
        3. Arroz
        4. Maiz""")
    var opcion:String? = readLine()
    return opcion
}
fun menuFrutas():String?{
    println("""             
        1. Fresa
        2. Plátano
        3. Uva
        4. Manzana
        5. Naranja
        3. Pera
        7. Cereza""")
    var opcion:String? = readLine()
    return opcion
}
fun menuCarne():String?{
    println("""             
        1. Res
        2. Pollo
        3. Chanco""")
    var opcion:String? = readLine()
    return opcion
}
fun menuVerduras():String?{
    println("""             
        1. Lechuga
        2. Tomates
        3. Acelga""")
    var opcion:String? = readLine()
    return opcion
}
fun menuAceites():String?{
    println("""             
        1. Oliva
        2. Palma
        3. Almendras""")
    var opcion:String? = readLine()
    return opcion
}

//Nota: el numero de lineas codigo se puede reducir considerablemente si damos al usuario la opcion de
// Ingresar su propios ingredientes