package kr.pe.batang.javaClass.exam.commander;

import java.io.File;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		// TODO
		return null;
	}
	
}