package uni.fmi.project.register.model;



public class RegisterScreenModel {

	private String name;
	private String owner;
	private Object message;

	public void setName(String name) {
		this.name = name;
		
	}

	public void setOwner(String owner) {
		this.owner = owner;
		
	}

	public void clickRegistrationButton() {
		message = RegisterService.register(name, owner);
		
	}

	public Object getMessage() {
		return message;
	}

	

}
