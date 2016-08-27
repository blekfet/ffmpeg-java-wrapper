package com.palefat.commandline.ffmpeg;

import java.io.File;
import java.util.ArrayList;

import com.palefat.commandline.arguments.StringParameter;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class ConcatFfmpegFunction extends FfmpegFunction {

	ArrayList<File> concatFiles = new ArrayList<File>();

	private File tempFile;

	public void setTempFile(File file) {

		this.outputFile = file;

	}

	@Override
	public String getCommandString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("-f concat -i ");
		stringBuilder.append(tempFile.getAbsolutePath());
		stringBuilder.append("-c copy ");
		stringBuilder.append(outputFile.getAbsolutePath());

		return stringBuilder.toString();
	}

	// TODO write to temp file not system out
	public void prepareTempFile() {
		for (File file : concatFiles) {
			System.out.println("'" + file.getAbsolutePath() + "'");
		}
	}
}
