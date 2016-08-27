package com.palefat.commandline.ffmpeg;

import java.io.File;

public abstract class FfmpegFunction {

	protected File outputFile;

	public abstract String getCommandString();

	public void setOutputFile(File file) {

		this.outputFile = file;

	}

}
