fun main(args: Array<String>) {

    val pedidos = Pedidos(cliente = Cliente(), pago = Pagos(), productos = Productos())
    println(pedidos.crearPedido())
}
