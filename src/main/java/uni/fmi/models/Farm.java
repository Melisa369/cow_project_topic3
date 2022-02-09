package uni.fmi.models;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;
/**
 * 
 */
public class Farm {

    /**
     * Default constructor
     */
    public Farm() {
    }
    
    public Farm(final String name, final String owner) {
    	this.name = name;
    	this.owner = owner;
    }

    private String name;

    private String owner;

    private Set<User> users;

    private Set<F_Cow> f_cows;


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
    public String getOwner() {
        
        return owner;
    }

    /**
     * @param owner 
     * @return
     */
    public void setOwner(String owner) {
        this.owner = owner;
       
    }

    /**
     * @return
     */
    public Set<User> getUser() {
       
        return null;
    }

    /**
     * @param users 
     * @return
     */
    public void setUser(Set<User> users) {
        
       
    }

    /**
     * @return
     */
    public Set<F_Cow> getF_Cow() {
        
        return null;
    }

    /**
     * @param f_cows 
     * @return
     */
    public void setF_Cow(Set<F_Cow> f_cows) {
        
        
    }

    /**
     * @return
     */
    public Set<M_Cow> getM_Cow() {
        
        return null;
    }

    /**
     * @param m_cows 
     * @return
     */
    public void setM_Cow(Set<M_Cow> m_cows) {
        // TODO implement here
        
    }

	@Override
	public int hashCode() {
		return Objects.hash(f_cows, name, owner, users);
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
		Farm other = (Farm) obj;
		return Objects.equals(f_cows, other.f_cows) && Objects.equals(name, other.name)
				&& Objects.equals(owner, other.owner) && Objects.equals(users, other.users);
	}

}