package entities;

public class Aluguel {
	
	private String name;
	private String email;
	
	// CONSTRUTORES
	
	public Aluguel(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	// ------------------------------------------------------------------------------------------------------------------------- //
	
	// GETTERS E SETTERS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// ------------------------------------------------------------------------------------------------------------------------- //
	
}
