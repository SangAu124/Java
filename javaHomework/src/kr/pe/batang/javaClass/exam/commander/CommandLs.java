package kr.pe.batang.javaClass.exam.commander;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		
		File[] childrenFiles = this.currentDirectory.listFiles();
		
		for(File file : childrenFiles) {
			String date = formatDate(convertToDate(file.lastModified()));
			boolean isChildrenDir = file.isDirectory();
			String isDir = "     ";
			long childrenFilesSize = file.length();
			
			
			if (isChildrenDir == true) 
				isDir = "<DIR>";
			
			System.out.printf("%4s  %s   %6s  %s\n", date, isDir, isChildrenDir(childrenFilesSize), file.getName());
		}
		
		return this.currentDirectory;
	}
	
	public String isChildrenDir(long size) {
		
		String sizeOfChildrenFile = ""+size;
		
		if (size > 1024 * 1024 * 1024)
			sizeOfChildrenFile = size/(1000000000) + "G";
		else if (size > 1024 * 1024) 
			sizeOfChildrenFile = size/(1000000) + "M";
		else if (size > 1024)
			sizeOfChildrenFile = size/(1000) + "K";
		else
			sizeOfChildrenFile = size + "";
		
		return sizeOfChildrenFile;
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
	
	public Date convertToDate(long unixTime) {
		return new Date(unixTime);
	}
	
}