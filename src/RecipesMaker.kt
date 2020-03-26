import model.Ingrediente
import model.Receta

fun main(args:Array<String>){
    var recetas:ArrayList<Receta> = ArrayList<Receta>()
    var opcion:String? = "0"
    while(opcion !="3" ){
        opcion= menu()
        when(opcion){
            "3" -> println("Saliendo")
            "2" -> viewRecipe(recetas)
            "1" -> recetas.add(makeRecipe())
            else -> println("Opción Equivocada")
        }
    }
}
fun makeRecipe():Receta{
    val receta: Receta = Receta()
    var opcion:String? = "0"
    do {
        opcion = menuIngredientes()
        when(opcion){
            "1" ->
            {   println("Ingrese la cantidad de Agua en lt")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                receta.agregarIngrediente(Ingrediente("Agua",cantidad))
            }
            "2" ->
            {   println("Ingrese la cantidad de Leche en lt")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                receta.agregarIngrediente(Ingrediente("Leche",cantidad))
            }
            "3" ->
            {   var op:String? = menuCarne()
                println("Ingrese la cantidad en lb")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Res",cantidad))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Pollo",cantidad))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Chancho",cantidad))
                }
            }
            "4" ->
            {   var op:String? = menuVerduras()
                println("Ingrese la cantidad en lb")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Lechuga",cantidad))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Tomates",cantidad))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Acelga",cantidad))
                }
            }
            "5" ->
            {   var op:String? = menuFrutas()
                println("Ingrese la cantidad ")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Fresa",cantidad))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Plátano",cantidad))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Uva",cantidad))
                }
                else if(op == "4"){
                    receta.agregarIngrediente(Ingrediente("Manzana",cantidad))
                }
                else if(op == "5"){
                    receta.agregarIngrediente(Ingrediente("Naranja",cantidad))
                }
                else if(op == "6"){
                    receta.agregarIngrediente(Ingrediente("Pera",cantidad))
                }
                else if(op == "7"){
                    receta.agregarIngrediente(Ingrediente("Cereza",cantidad))
                }
            }
            "6" ->
            {   var op:String? = menuCereal()
                println("Ingrese la cantidad ")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Avena",cantidad))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Trigo",cantidad))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Arroz",cantidad))
                }
                else if(op == "4"){
                    receta.agregarIngrediente(Ingrediente("Maiz",cantidad))
                }
            }
            "7" ->
            {   println("Ingrese la cantidad de Huevos")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                receta.agregarIngrediente(Ingrediente("Huevos",cantidad))
            }
            "8" ->
            {   var op:String? = menuAceites()
                println("Ingrese la cantidad en lt")
                var cantidad:String? = readLine()
                if (cantidad==null) cantidad="0"
                if (op == "1"){
                    receta.agregarIngrediente(Ingrediente("Oliva",cantidad))
                }
                else if(op == "2"){
                    receta.agregarIngrediente(Ingrediente("Palma",cantidad))
                }
                else if(op == "3"){
                    receta.agregarIngrediente(Ingrediente("Almendras",cantidad))
                }
            }
        }
    }while (opcion != "9")
    return  receta
}
fun viewRecipe(recetas:ArrayList<Receta>){
    for((i,receta) in recetas.withIndex()){
        println("Viendo Receta ${i+1}")
        receta.montrarIngredientes()
    }

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
                Haciendo receta
        Selecciona por categoría el ingrediente que buscas """)
    var ingredientes:Array<String> = arrayOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceites","Terminar Receta")
    for((index, ingedientes) in ingredientes.withIndex()){
        println(" ${index+1}. $ingedientes")
    }
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