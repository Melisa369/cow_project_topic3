package uni.fmi.models;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class F_Cow {

    private String cowNumber;

	private String cowSex;

	private String cowOffspring;

	/**
     * Default constructor
     */
    public F_Cow() {
    }
    
    public F_Cow(final String cowNumber, final String cowSex, final String cowOffspring) {
    	this.cowNumber = cowNumber;
    	this.cowSex  = cowSex;
    	this.cowOffspring = cowOffspring;
    	
    }

    private String number;

    private String mother;

    private String father;

    private String offspring;

    private Set<Farm> farms;

    /**
     * @return
     */
    public String getNumber() {
       
        return number;
    }

    /**
     * @param number 
     * @return
     */
    public void setNumber(String number) {
       
       this.number = number;
    }

    /**
     * @return
     */
    public String getMother() {
       
        return mother;
    }

    /**
     * @param mother 
     * @return
     */
    public void setMother(String mother) {
        
        this.mother = mother;
    }

    /**
     * @return
     */
    public String getFather() {
        
        return father;
    }

    /**
     * @param father 
     * @return
     */
    public void setFather(String father) {
        
        this.father = father;
    }

    /**
     * @return
     */
    public String getOffspring() {
       
        return offspring;
    }

    /**
     * @param offspring 
     * @return
     */
    public void setOffspring(String offspring) {
        
        this.offspring = offspring;
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
      
        
    }

	@Override
	public int hashCode() {
		return Objects.hash(farms, father, mother, number, offspring);
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
		F_Cow other = (F_Cow) obj;
		return Objects.equals(farms, other.farms) && Objects.equals(father, other.father)
				&& Objects.equals(mother, other.mother) && Objects.equals(number, other.number)
				&& Objects.equals(offspring, other.offspring);
	}

}