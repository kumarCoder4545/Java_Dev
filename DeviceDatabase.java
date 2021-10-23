package array;

public class DeviceDatabase {
	Device obj[]=new Device[1000];
	int countdevice=0;
	
	public boolean insertNewDevice(Device d) {
		boolean isinserted=false;
		if(d!=null) {
			obj[countdevice]=d;
			//obj[countdevice].setModelNumber(modelno);
			countdevice++;
			isinserted=true;
		}
		
		return isinserted;
	}
	public Device[] getAllDeviceData() {
		Device temp[]=new Device[countdevice];
		for(int i=0;i<countdevice;i++) {
			temp[i]=obj[i];
		}
		return temp;
	}
	public boolean searchByModelNumber(String modelno) {
		boolean isfind=false;
		for(int i=0;i<countdevice;i++) {
			if(modelno.equals(obj[i].getModelNumber())) {
				isfind=true;
				return isfind;
			}
		}
		return isfind;
	}
	public Device[] printDeviceWithinRange(int start,int end) {
		Device temp[]=new Device[countdevice];
		int k=0;
		for(int i=0;i<countdevice;i++) {
			if(obj[i].getCost()>=start && obj[i].getCost()<=end) {
				temp[k++]=obj[i];
			}
		}
		return temp;
	}
	
	public Device[] getDeviceBasedOnRangeAndBrandName(int start,
			int end,String brandname) {
		//int start=0,end=0;
		Device res[]=new Device[countdevice];
		int k=0;
		for(int i=0;i<countdevice;i++) {
			if(obj[i].getCost()>=start && obj[i].getCost()<=end && brandname.equals(obj[i].getBrandName())) {
				res[k++]=obj[i];
			}
		}
		
		return res;
	}


}
