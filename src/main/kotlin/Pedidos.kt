import java.util.Date
import Cliente as cliente
@Suppress("DEPRECATION", "SameParameterValue")
class Pedidos(var productos: Productos, var pago: Pagos) {

    private val id: String = ""
    private val infoPedido = mutableListOf<String>()
    private var fechaPedido: Date = Date()
    private var estado = "Enviado" // este valor podrá ser "pendiete", "pagado", "procesado", "enviado", "entregado".

    fun crearPedido(): MutableList<String> {
        pago.pago = false
        productos.id = "#P001"
        productos.nombre = "camiseta"
        productos.descripcion = "Camiseta de estampado singular"
        productos.precio = 40
        productos.impuesto = 12
        cliente.id = "#C001"
        cliente.nombre = "Juan"
        cliente.numero = 635677889
        fechaPedido = Date(2022, 12, 6, 1, 3, 23)

        infoPedido.add(
            """
                Referencias del pedido realizado a: $fechaPedido
                Estado: ${estadoPedido(estado,id)}
                
                El producto con id: ${productos.id}
                hace referencia a: ${productos.nombre}
                con descripción: ${productos.descripcion}
                con precio: ${calcularImpuesto(productos.precio, productos.impuesto)}€
                y un impuesto del ${productos.impuesto}%
                
                Refente al cliente: ${cliente.id}
                con nombre: ${cliente.nombre}
                y número: ${cliente.numero}""".trimIndent(),
        )
        return infoPedido
    }

    private fun estadoPedido(estado: String, id: String): String {
        if (pago.pago) {
            return (
                """Estado del pedido $id:
                   este pedido se encuentra $estado
                """.trimIndent()
                )
        }
        when (estado) {
            "pendiente" -> return (
                """Estado del pedido $id:
                   este pedido se encuentra $estado
                """.trimIndent()
                )
            "procesado" -> return (
                """Estado del pedido $id:
                   este pedido se encuentra $estado
                """.trimIndent()
                )
            "enviado" -> return (
                """Estado del pedido $id:
                   este pedido se encuentra $estado
                """.trimIndent()
                )
            "entregado" -> return (
                """Estado del pedido $id:
                   este pedido se encuentra $estado
                """.trimIndent()
                )
        }
        return (
            """Estado del pedido $id:
                   este pedido se encuentra $estado
            """.trimIndent()
            )
    }
    private fun calcularImpuesto(precio: Int, impuesto: Int): Int {
        return (precio * impuesto) / 100
    }
}
