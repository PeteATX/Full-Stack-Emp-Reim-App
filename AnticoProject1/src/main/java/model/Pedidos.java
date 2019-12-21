package model;

import java.util.Arrays;

public class Pedidos {
	private int pedido_id;
	private String status;
	private float cantidad;
	private byte[] image;
	private int user_id;
	private int gerente_id;

	public Pedidos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedidos(int pedido_id, String status, float cantidad, byte[] image, int user_id, int gerente_id) {
		super();
		this.pedido_id = pedido_id;
		this.status = status;
		this.cantidad = cantidad;
		this.image = image;
		this.user_id = user_id;
		this.gerente_id = gerente_id;
	}

	public int getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(int pedido_id) {
		this.pedido_id = pedido_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getGerente_id() {
		return gerente_id;
	}

	public void setGerente_id(int gerente_id) {
		this.gerente_id = gerente_id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cantidad);
		result = prime * result + gerente_id;
		result = prime * result + Arrays.hashCode(image);
		result = prime * result + pedido_id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + user_id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedidos other = (Pedidos) obj;
		if (Float.floatToIntBits(cantidad) != Float.floatToIntBits(other.cantidad))
			return false;
		if (gerente_id != other.gerente_id)
			return false;
		if (!Arrays.equals(image, other.image))
			return false;
		if (pedido_id != other.pedido_id)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedidos [pedido_id=" + pedido_id + ", status=" + status + ", cantidad=" + cantidad + ", image="
				+ Arrays.toString(image) + ", user_id=" + user_id + ", gerente_id=" + gerente_id + "]";
	}
  
}