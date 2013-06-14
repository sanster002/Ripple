package x.y.ds;

import java.util.regex.Pattern;

public class NounInfoHolder {

	private String ruleName = null;
	private String pattern = null;
	private Pattern patternObj = null;
	private String[] replacementOf = {};
	
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	public Pattern getPattern() {
		
		if(patternObj == null && pattern != null){
			patternObj = Pattern.compile(pattern);
		}
		return patternObj;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String[] getReplacementOf() {
		return replacementOf;
	}
	public void setReplacementOf(String[] replacementOf) {
		this.replacementOf = replacementOf;
	}
	
}
