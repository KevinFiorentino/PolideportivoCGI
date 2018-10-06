package model;

public class Turno {
	
	private int idTurno;
	private String fechaHora;
	private String deporte;
	private String filial;
	private String usuario;
	
	public Turno(String fechaHora, String deporte, String filial, String usuario) {
		this.fechaHora = fechaHora;
		this.deporte = deporte;
		this.filial = filial;
		this.usuario = usuario;
	}

	public int getIdTurno() {
		return idTurno;}
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;}

	public String getFechaHora() {
		return fechaHora;}
	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;}

	public String getDeporte() {
		return deporte;}
	public void setDeporte(String deporte) {
		this.deporte = deporte;}

	public String getFilial() {
		return filial;}
	public void setFilial(String filial) {
		this.filial = filial;}

	public String getUsuario() {
		return usuario;}
	public void setUsuario(String usuario) {
		this.usuario = usuario;}
	
	
}
