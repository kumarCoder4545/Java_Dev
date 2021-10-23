package array;
import java.util.Random;
public class Device {

	private String deviceName;
	private String modelNumber; // as Id , should be auto-generated combination of char or numbers (6 chars) 
	// such as abc123 , xyz343, bjb543 
	private int cost;
	private int avgRating;
    private String brandName;
	
	public Device(String deviceName, int cost, int avgRating,String brandName) {
		this.deviceName = deviceName;
		this.cost = cost;
		this.avgRating = avgRating;
    this.brandName = brandName;
    this.modelNumber= getRandomString();
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getAvgRating() {
		return avgRating;
	}

	public void setAvgRating(int avgRating) {
		this.avgRating = avgRating;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	@Override
	public String toString() {
		return "Device [deviceName=" + deviceName + ", modelNumber=" + modelNumber + ", cost=" + cost + ", avgRating="
				+ avgRating + ", brandName=" + brandName + "]";
	} 
	public static String getRandomString() {
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();

	    Random random = new Random();

	    // specify length of random string
	    int length = 3;

	    for(int i = 0; i < length; i++) {

	      // generate random index number
	      int index = random.nextInt(alphabet.length());

	      // get character specified by index
	      // from the string
	      char randomChar = alphabet.charAt(index);

	      // append the character to string builder
	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	    randomString+=random.nextInt(999);
	    return randomString;
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
		int result = 1;
		System.out.println(" Hashcode called "+this.deviceName);
		result=this.deviceName.length()+cost+this.modelNumber.length();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Device) {
			System.out.println("Equals called for "+this.brandName);
			Device d = (Device)obj;


			boolean b1=this.deviceName.equals(d.deviceName);
			boolean b2=this.cost == d.cost;
			boolean b3=this.avgRating == d.avgRating;
			boolean b4=this.brandName.equals(d.brandName);
			return b1&b2&b3&b4;
			
		}else {
			return false;
		}
			
	} 
	
	
	
	
}//end 