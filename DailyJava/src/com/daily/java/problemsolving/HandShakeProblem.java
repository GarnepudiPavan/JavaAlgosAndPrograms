package com.daily.java.problemsolving;

/**
 * If there are n people then each person has to do n-1 handshakes (excluding
 * shaking hands with oneself). Therefore there will be a total of
 * n(n-1) handshakes. But if person 1 handshakes with 2 then we can only
 * consider a single handshake not 2. So to remove that duplication we
 * have to take into account half of the handshakes that is n(n-1)/2;
 * If there are 20 people then each person has to do 19 handshakes.
 * Hence total handshakes would be 29 * 19. Since we need
 * to consider handshake between two as a single exchange 
 * of hanshake it will be 20*19/2 = 380/2=190.
 * @author gv
 *
 */
public class HandShakeProblem {

	String array [];
	
	public HandShakeProblem(String array[]) {
		this.array = array;
		
	}
	
	public void handShake() {
		int count =0;
		System.out.println("Number of hand shakes for given members"+ " "+array.length+" "+"should be:"+" "+array.length*(array.length-1)/2);
		/**
		 * Two for loops needed as we need to select
		 * first person in array and handshake with next person and repeat
		 * entire array. So it will be order of n*n
		 */
		
		for(int i=0; i<array.length; i++) {
			for(int j=i; j<array.length-1; j++) {
				System.out.println("Handshake between given members"+" "+array[i]+"X"+array[j+1]+" "+count++);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = "ABCDEFGHIJ".split("");
		HandShakeProblem object1 = new HandShakeProblem(array);
		object1.handShake();

	}

}
