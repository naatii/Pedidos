fun main(args: Array<String>) {
    val pedidos = Pedidos(pago = Pagos(), productos = Productos())
    println(pedidos.crearPedido())
}
