	package spring;


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Objects {
	
	private List fruits;
	private Set crickters;
	private Map countrycapitals;
	private List<FruitPrices> fruitprices;
	private Set<CrickterValues> cricktervalues;
	private Map<CountryCapitalDistances,CountryDistances> distances;
	
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

	public List<FruitPrices> getFruitprices() {
		return fruitprices;
	}


	public void setFruitprices(List<FruitPrices> fruitprices) {
		this.fruitprices = fruitprices;
	}


	public Set<CrickterValues> getCricktervalues() {
		return cricktervalues;
	}


	public void setCricktervalues(Set<CrickterValues> cricktervalues) {
		this.cricktervalues = cricktervalues;
	}


	public Map<CountryCapitalDistances, CountryDistances> getDistances() {
		return distances;
	}


	public void setDistances(Map<CountryCapitalDistances, CountryDistances> distances) {
		this.distances = distances;
	}


	public void show() {
		
		System.out.println("fruits List.................");
		for(Object fruit: fruits) {
			System.out.println(fruit);
		}
		System.out.println("fruits price List.................");
		for(FruitPrices fruitprice:fruitprices) {
			System.out.println(fruitprice.getFruitprices());
		}
		
		System.out.println("Crickters Set.................");
		for(Object crickter: crickters) {
			System.out.println(crickter);
		}
		
		System.out.println("Crickters value Set 1 with getter.................");
		for(CrickterValues cricktervalues: cricktervalues) {
			System.out.println(cricktervalues.getCricktervalues());
		}
		
		System.out.println("CountryCapital Map.............");
		Set countrycapitalkeys=countrycapitals.keySet();
		
		for(Object countrycapitalkey:countrycapitalkeys) {
			System.out.println("Country = "+countrycapitalkey+" CountryCapital = "+countrycapitals.get(countrycapitalkey));
		} 
		
		System.out.println("CountryCapital Distance Map.............");
		 Set<Entry<CountryCapitalDistances,CountryDistances>> entrySetDistances= distances.entrySet();
		 Iterator<Entry<CountryCapitalDistances,CountryDistances>> entrySetIterators = entrySetDistances.iterator();
		
		while(entrySetIterators.hasNext()) {
			Entry<CountryCapitalDistances,CountryDistances> entrydistance= entrySetIterators.next();
			CountryCapitalDistances countrycapitaldistance=entrydistance.getKey();
			CountryDistances countrydistance=entrydistance.getValue();
			System.out.println("CountryCapitalDistance = "+countrycapitaldistance.getCountrycapitaldistances()+" CountryCapital = "+countrydistance.getCountrydistancs());
		} 
		
		
		
	}
	
}
