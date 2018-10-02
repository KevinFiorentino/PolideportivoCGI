package model;

public class Filial {

	private int idFilial;
	private String horarioDesde;
	private String horarioHasta;
	private String diaMantenimiento;
	private Localidad localidad;
	
	public Filial(String horarioDesde, String horarioHasta, String diaMantenimiento,
			Localidad localidad) {
		this.horarioDesde = horarioDesde;
		this.horarioHasta = horarioHasta;
		this.diaMantenimiento = diaMantenimiento;
		this.localidad = localidad;
	}
	
	public int getIdFilial() {
		return idFilial;}
	public void setIdFilial(int idFilial) {
		this.idFilial = idFilial;}
	
	public String getHorarioDesde() {
		return horarioDesde;}
	public void setHorarioDesde(String horarioDesde) {
		this.horarioDesde = horarioDesde;}
	
	public String getHorarioHasta() {
		return horarioHasta;}
	public void setHorarioHasta(String horarioHasta) {
		this.horarioHasta = horarioHasta;}
	
	public String getDiaMantenimiento() {
		return diaMantenimiento;}
	public void setDiaMantenimiento(String diaMantenimiento) {
		this.diaMantenimiento = diaMantenimiento;}
	
	public Localidad getLocalidad() {
		return localidad;}
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;}
	
	
}
