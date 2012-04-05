package za.co.hardlyhere.gherkin.eclipse.plugin.editors;

import org.eclipse.jface.text.rules.IWordDetector;

public class GherkinStarStepWordDetector implements IWordDetector {

	@Override
	public boolean isWordStart(char c) {
		return c=='*';
	}

	@Override
	public boolean isWordPart(char c) {
		return false;
	}

}
