package test;

public class test {
	public static void main(String[] args){
		 
		String str="{\"ID\":\"JTT0001\",\"Time\":\"2017-12-18 16:11:45\",\"Lat\":22.6051636,\"Lon\":113.9894155,\"Alt\":49.99,\"Yaw\":72.6961441,\"Roll\":-0.3225535,\"Pitch\":-20.3738117,\"Speed\":6.8382597,\"CO\":0,\"SO2\":0,\"O3\":0,\"NO2\":0,\"PM10\":0,\"PM25\":0,\"NH3\":0,\"CO2\":0,\"H2S\":0,\"Temp\":0,\"Dumidity\":0}";
		
		try {
			Suju sj=Util.fromJson(str, Suju.class);
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
