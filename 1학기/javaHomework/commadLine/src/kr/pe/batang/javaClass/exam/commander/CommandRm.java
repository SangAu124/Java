package kr.pe.batang.javaClass.exam.commander;

import java.io.File;
import java.util.Scanner;

public class CommandRm extends AbstractCommand {

	private Scanner scanner = new Scanner(System.in);

	public CommandRm(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}
	
	@Override
	public File executeCommand() {
		
		String[] inputArgs = commandLine.split(" ");
		
		File isDirValid = new File(currentDirectory + "/" + inputArgs[1]);
		
		if(isDirValid.exists() &&
				isDirValid.isDirectory() &&
					isDirValid.length() == 64) {
			isDirValid.delete();
		} else if (!(isDirValid.isDirectory())) {
			if(!(isDirValid.exists()))
				System.out.println("\t\t파일을 찾을 수 없습니다\n");
			else
				deleteFile(isDirValid);
		} else {
			System.out.println("cannot delete the directory");
		}
		
		return currentDirectory;
	}

	private void deleteFile(File file) {
		System.out.println("정말로 삭제하시겠습니까?");
		String input = scanner.nextLine();

		if( (input.equals("Y")) || (input.equals("y")) )
			file.delete();
		else if ( (input.equals("N")) || (input.equals("n")) )
			System.out.println("파일 삭제를 하지 않았습니다. ");
	}

}
