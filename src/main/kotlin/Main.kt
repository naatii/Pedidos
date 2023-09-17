fun main() {
    val pedidos = Pedidos(pago = Pagos(), productos = Productos())
    println(pedidos.crearPedido())
}
