	package spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Objects {
	
	private List fruits;
	private Set crickters;
	private Map countrycapitals;

	
	public List getFruits() {
		return fruits;
	}


	public void setFruits(List fruits) {
		this.fruits = fruits;
	}


	public Set getCrickters() {
		return crickters;
	}


	public void setCrickters(Set crickters) {
		this.crickters = crickters;
	}


	public Map getCountrycapitals() {
		return countrycapitals;
	}


	public void setCountrycapitals(Map countrycapitals) {
		this.countrycapitals = countrycapitals;
	}


	public void show() {
		
		System.out.println("fruits List.................");
		for(Object fruit: fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Crickters Set.................");
		for(Object crickter: crickters) {
			System.out.println(crickter);
		}
		
		System.out.println("CountryCapital Map.............");
		Set countrycapitalkeys=countrycapitals.keySet();
		
		for(Object countrycapitalkey:countrycapitalkeys) {
			System.out.println("Country = "+countrycapitalkey+" CountryCapital = "+countrycapitals.get(countrycapitalkey));
		} 
		
		
		
	}
	
}
