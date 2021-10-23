package array;

public class TrueCallerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MobilePhoneDatabase db = new MobilePhoneDatabase();
		
		long arr[] =db.getAllPhoneNumbers();
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println((i+1)+") "+arr[i]);
		}
		
		
		boolean isValid = db.verifyPhoneNumbers(48484848L);
		System.out.println(isValid);
		boolean isUpdate = db.updatePhoneNumber(9595959999L,8485959595L );
		System.out.println(isUpdate);
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println((i+1)+") "+arr[i]);
		}
	}

}
