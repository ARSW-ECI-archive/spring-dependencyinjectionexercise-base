package edu.eci.arsw.spring.didemo;

public class GrammarChecker {

	SpellChecker sc;

	
	public SpellChecker getSc() {
		return sc;
	}

	public void setSc(SpellChecker sc) {
		this.sc = sc;
	}


	public String check(String text){
		
		StringBuffer sb=new StringBuffer();
		sb.append("Spell checking output:"+sc.checkSpell(text));
		sb.append("Plagiarism checking output: Not available yet");
		
		
		return sb.toString();
		
	}
	
	
}
