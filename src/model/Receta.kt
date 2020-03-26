package model

class Receta {
    private var ingredientes:ArrayList<Ingrediente> = ArrayList<Ingrediente>()
    fun agregarIngrediente(ingrediente: Ingrediente){
        ingredientes.add(ingrediente)
    }
    fun montrarIngredientes(){
        for (i:Ingrediente in ingredientes)
        {
            println("Ingrediente:"+ i.nombre+ " Cantidad: "+i.cantidad)
        }
    }
}