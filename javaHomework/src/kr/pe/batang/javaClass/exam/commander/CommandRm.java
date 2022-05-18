package kr.pe.batang.javaClass.exam.commander;

import java.io.File;

public class CommandRm extends AbstractCommand {

	public CommandRm(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}
	
	@Override
	public File executeCommand() {
		
		String[] inputArgs = commandLine.split(" ");
		
		File isDirValid = new File(currentDirectory + "/" + inputArgs[1]);
		
		if(isDirValid.exists() && 
				isDirValid.isDirectory() && 
					isDirValid.length() == 64)
			isDirValid.delete();
		else {
			System.out.println("cannot delete the directory");
		}
		
		return currentDirectory;
	}

}
