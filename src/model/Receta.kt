package model

class Receta {
    var ingredientes:ArrayList<Ingrediente> = ArrayList<Ingrediente>()
    fun agregarIngrediente(ingrediente: Ingrediente){
        ingredientes.plus(ingrediente)
    }
    fun montrarIngredientes(){
        for (i:Ingrediente in ingredientes)
        {
            println(i.nombre)
        }
    }
}