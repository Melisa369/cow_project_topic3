package uni.fmi.models;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

/**
 * 
 */
public class User {
    
    private String username;

    private String password;

    private String name;

    private String email;

    private String address;

    private String phone;

    
    private Set<Association> associations;

    private Set<Farm> farms;
    
    /**
     * Constructor
     */
    public User() {
    	this(null, null, null, null, null, null);
    }
    public User(final String username, final String password) {
		this(username, password, null, null, null, null);
	}

	public User(String username, String password, String email, String name, String address, String phone) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
        
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
        
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name 
     * @return
     */
    public void setName(String name) {
        this.name = name;
        
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
       this.email = email;
        
    }

    /**
     * @return
     */
    public String getAddress() {
        // TODO implement here
        return address;
    }

    /**
     * @param address 
     * @return
     */
    public void setAddress(String address) {
        this.address = address;
        
    }

    /**
     * @return
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone 
     * @return
     */
    public void setPhone(String phone) {
        this.phone = phone;
        
    }

    /**
     * @return
     */
    public Set<Association> getAssociation() {
        // TODO implement here
        return null;
    }

    /**
     * @param associations 
     * @return
     */
    public void setAssociation(Set<Association> associations) {
    	if (associations != null) {
			this.associations  = associations;
		} else {
			this.associations.clear();
		}
        
    }

    /**
	 * @return existing association or empty Set
	 */
	public Set<Association> getAssociations() {
		if ( associations == null) {
			associations = new HashSet<>();
		}
		return associations;
	}

    
    /**
     * @return
     */
    public Set<Farm> getFarm() {
        return null;
    }

    /**
     * @param farms 
     * @return
     */
    public void setFarm(Set<Farm> farms) {
        this.farms = farms;
       
    }
	@Override
	public int hashCode() {
		return Objects.hash(address, associations, email, farms, name, password, phone, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		User other = (User) obj;
		return Objects.equals(address, other.address) && Objects.equals(associations, other.associations)
				&& Objects.equals(email, other.email) && Objects.equals(farms, other.farms)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password)
				&& Objects.equals(phone, other.phone) && Objects.equals(username, other.username);
	}

}