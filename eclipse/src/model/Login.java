package model;

public class Login {
	
	private	int idLogin;	//idUsuario
	private String user;
	private String pass;
	private TipoLogin idTipoLogin;
	
	public Login(String user, String pass, TipoLogin idTipoLogin) {
		this.user = user;
		this.pass = pass;
		this.idTipoLogin = idTipoLogin;
	}

	public int getIdLogin() {
		return idLogin;}
	public void setIdLogin(int idLogin) {
		this.idLogin = idLogin;}

	public String getUser() {
		return user;}
	public void setUser(String user) {
		this.user = user;}

	public String getPass() {
		return pass;}
	public void setPass(String pass) {
		this.pass = pass;}

	public TipoLogin getIdTipoLogin() {
		return idTipoLogin;}
	public void setIdTipoLogin(TipoLogin idTipoLogin) {
		this.idTipoLogin = idTipoLogin;}
	
	
}
