package kr.pe.batang.javaClass.exam.commander;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		String[] inputArgs = commandLine.split(" ");
		
		if (inputArgs[1].equals("..")) {
			if (currentDirectory.getParentFile() != null) {
				return currentDirectory.getParentFile();
			} else {
				System.out.println("cannot find the path");
				return currentDirectory;
			}
		} else {
			File isFileValid = new File(currentDirectory + "/" + inputArgs[1]);
			if (isFileValid.exists() && isFileValid.isDirectory()) {
				return isFileValid;
			}
			else {
				System.out.println("cannot find the path");
				return currentDirectory;
			}
		}
	}
}