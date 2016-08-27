package com.palefat.commandline.arguments;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ArgumentString {

	StringBuilder builder = new StringBuilder();
	List<Parameter> parameters = new ArrayList<Parameter>();
	File outputFile;

	public ArgumentString(File outputFile) {
		this.outputFile = outputFile;
	}

	public void appendParameter(Parameter parameter) {
		parameters.add(parameter);
	}

	@Override
	public String toString() {
		for (Parameter parameter : parameters) {
			builder.append(parameter);
			builder.append(" ");
		}
		builder.append("'" + outputFile.getAbsolutePath() + "'");
		return builder.toString();
	}

}
