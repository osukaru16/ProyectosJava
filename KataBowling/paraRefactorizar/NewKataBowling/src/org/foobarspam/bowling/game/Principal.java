package org.foobarspam.bowling.game;


public class Principal {

	public static void main(String[] args) {
		/*
		String pins = "12345123451234512345";
		//int total = 60;
		
		ScoreCard scoreCard = new ScoreCard(pins);
		
		//calculateScore(scoreCard);
		
		System.out.println(scoreCard.getTotalScore());	
		
		
		String scoreCard2 = "12345123451234512345";
		int total = 0;
		char pin;
		for(int i=0; i < scoreCard2.length(); i++){
			pin= scoreCard2.charAt(i);
			total += Character.getNumericValue(pin);
			System.out.println(pin+" "+total);
		
		}*/
		
		
		

		String pins = "5/5/5/5/5/5/5/5/5/5/5";
		int total = 150;		
		ScoreCard scoreCard = new ScoreCard(pins);		
		//calculateScore(scoreCard);		
		System.out.println(scoreCard.getTotalScore());	
		
		
		
		
		
		
		
		
		
		
	}

}
