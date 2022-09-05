package s22.viikko2osa3.domain;

import javax.validation.constraints.Size;

public class Friend {
	
	@Size(min=2, max=30)
	private String name;
	
	public Friend() {
		super();
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + "]";
	}
	
	
	
}
