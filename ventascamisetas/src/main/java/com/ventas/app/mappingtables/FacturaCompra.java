package com.ventas.app.mappingtables;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "FACTURAS_COMPRAS")
public class FacturaCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_facturas")
	private int idFactura;

	@Column(name = "id_cliente")
	private int idCliente;

	@Column(name = "sub_total")
	private BigInteger subTotal;

	@Column(name = "iva")
	private int iva;

	@Column(name = "valor_total")
	private BigInteger valorTotal;

	@Column(name = "id_forma_pago")
	private int idFormaPago;

	@Column(name = "fecha")
	private Timestamp fecha;

	@ManyToOne
	@JoinColumn(name = "id_persona", insertable = false, updatable = false)
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id_forma_pago", insertable = false, updatable = false)
	private FormasPagos formaPago;

	/*****************************
	 * start getters and setters
	 ****************************/

	public BigInteger getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(BigInteger valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getIva() {
		return this.iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public Timestamp getFecha() {
		return this.fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public int getIdFormaPago() {
		return this.idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public BigInteger getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(BigInteger subTotal) {
		this.subTotal = subTotal;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
}
