package com.ventas.app.mappingtables;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "ORDEN_COMPRAS")
public class OrdenCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_orden")
	private int idOrden;

	@Column(name = "id_factura")
	private int idFactura;

	@Column(name = "id_producto")
	private int idProducto;

	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "valor_unitario")
	private BigInteger valorUnitario;

	@Column(name = "valor_total")
	private BigInteger valorTotal;

	@ManyToOne
	@JoinColumn(name = "id_factura", insertable = false, updatable = false)
	private FacturaCompra facturaCompra;

	@ManyToOne
	@JoinColumn(name = "id_configuracion")
	private ConfiguracionCamiseta producto;

	/******************************
	 * start getters and setters
	 *****************************/

	public FacturaCompra getFacturaCompra() {
		return this.facturaCompra;
	}

	public void setFacturaCompra(FacturaCompra facturaCompra) {
		this.facturaCompra = facturaCompra;
	}

	public BigInteger getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(BigInteger valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigInteger getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(BigInteger valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdFatura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public int getIdOrden() {
		return this.idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

}
