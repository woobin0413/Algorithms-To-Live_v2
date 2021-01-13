package Leetcode;

import java.util.HashMap;

public class Design_Parking_System {

	HashMap<String, Integer> map = new HashMap<>();

	int [] parkingLot = new int [4];
	public Design_Parking_System(int big, int medium, int small) {
//		map.put("big", big);
//		map.put("medium", medium);
//		map.put("small", small);
		 
	    parkingLot[1] = big;
	    parkingLot[2] = medium;
	    parkingLot[3] = small;
	}

	public boolean addCar(int carType) {
		
		if(parkingLot[carType]>0) {
			parkingLot[carType]--;
			return true;
		} 
		
		return false;
		
		
		
//		switch (carType) {
//		case 1:
//			if(map.get("big") > 0) {
//				map.put("big", map.get("big")-1);
//				return true;
//			}
//			break;
//		case 2:
//			if(map.get("medium") > 0) {
//				map.put("medium", map.get("medium")-1);
//				return true;
//			}
//			break;
//		case 3:
//			if(map.get("small") > 0) {
//				map.put("small", map.get("small")-1);
//				return true;
//			}
//			break;
//
//		default:
//			return false;
//			
//		}
//
//		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Design_Parking_System parkingSystem = new Design_Parking_System(1, 1, 0);

		System.out.println(parkingSystem.addCar(1));
		System.out.println(parkingSystem.addCar(2));
		System.out.println(parkingSystem.addCar(3));
		System.out.println(parkingSystem.addCar(1));

	}

}
