package uni.fmi.models;
import java.util.Set;
import java.util.HashSet;

/**
 * 
 */
public class Association {

    /**
     * Default constructor
     */
    public Association() {
    }

    private String name;

    private Set<User> users;


    /**
     * @return
     */
    public String getName() {
        // TODO implement here
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
    public Set<User> getUser() {
        
        return null;
    }

    /**
     * @param users 
     * @return
     */
    public void setUser(Set<User> users) {
       
       
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((users == null) ? 0 : users.hashCode());
		return result;
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
		Association other = (Association) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (users == null) {
			if (other.users != null) {
				return false;
			}
		} else if (!users.equals(other.users)) {
			return false;
		}
		return true;
	}

}