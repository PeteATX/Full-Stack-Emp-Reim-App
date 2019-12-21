package model;

public class Usuario {
  private int user_id;
  private String nombre;
  private String apellido;
  private String usuario;
  private String contrasena;
  private String papel;
  
		public Usuario() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Usuario(int user_id, String nombre, String apellido, String usuario, String contrasena, String papel) {
			super();
			this.user_id = user_id;
			this.nombre = nombre;
			this.apellido = apellido;
			this.usuario = usuario;
			this.contrasena = contrasena;
			this.papel = papel;
		}
		public int getUser_id() {
			return user_id;
		}
		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getUsuario() {
			return usuario;
		}
		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}
		public String getContrasena() {
			return contrasena;
		}
		public void setContrasena(String contrasena) {
			this.contrasena = contrasena;
		}
		public String getPapel() {
			return papel;
		}
		public void setPapel(String papel) {
			this.papel = papel;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
			result = prime * result + ((contrasena == null) ? 0 : contrasena.hashCode());
			result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
			result = prime * result + ((papel == null) ? 0 : papel.hashCode());
			result = prime * result + user_id;
			result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
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
			Usuario other = (Usuario) obj;
			if (apellido == null) {
				if (other.apellido != null)
					return false;
			} else if (!apellido.equals(other.apellido))
				return false;
			if (contrasena == null) {
				if (other.contrasena != null)
					return false;
			} else if (!contrasena.equals(other.contrasena))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			if (papel == null) {
				if (other.papel != null)
					return false;
			} else if (!papel.equals(other.papel))
				return false;
			if (user_id != other.user_id)
				return false;
			if (usuario == null) {
				if (other.usuario != null)
					return false;
			} else if (!usuario.equals(other.usuario))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Usuario [user_id=" + user_id + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
					+ ", contrasena=" + contrasena + ", papel=" + papel + "]";
		}
		  
		}
