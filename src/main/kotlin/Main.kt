import java.util.Date

fun main(args: Array<String>) {

    val pedidos = Pedidos(cliente = Cliente(), productos = Productos())
    println(pedidos.crearPedido())
}
