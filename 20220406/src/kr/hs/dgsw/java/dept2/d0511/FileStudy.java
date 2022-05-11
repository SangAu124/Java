package kr.hs.dgsw.java.dept2.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {

	public void studyFileData() throws Exception {
		
		File file = new File("/Users/gimsang-eun/공부/자바/재봉/File");
		
		/* 파일 이름 알기 */
		String name = file.getName();
		System.out.println("파일 이름 알기");
		System.out.println(name);
		System.out.println();
		
		/* 파일 이름 알기 */
		File file2 = new File("./abc.txt");
		String path = file2.getPath();
		String absolutePath = file2.getAbsolutePath();
		String canonicalPath = file2.getCanonicalPath();
		
		System.out.println("파일 경로 알기");
		System.out.println("getPath   - " + path);
		System.out.println("AbsolutePath   - " + path);
		System.out.println("CanonicalPath   - " + path);
		System.out.println();
		
		/* 파일의 존재 여부 */
		boolean exist = file.exists();
		System.out.println("파일의 존재 여부");
		System.out.println(name + "   " + exist);
		System.out.println(file2.getName() + "    " + file2.exists());
		System.out.println();
		
		/* 파일의 크기 */
		long size = file.length();
		System.out.println("파일의 크기");
		System.out.println(name + "   " + size);
		System.out.println(file2.getName() + "    " + file2.length());
		System.out.println();
		
		/* 파일의 수정 시간 */
		long time = file.lastModified();
		System.out.println("파일의 수정된 시간");
		System.out.println(name + "   " + formatDate(convertToDate(time)));
		System.out.println(file2.getName() + "    " + file2.lastModified());
		System.out.println();
		
		
	}
	
	public void studyManage() throws Exception {
		/* 파일 만들기 */
		File file = new File("/Users/gimsang-eun/공부/자바/재봉/File/hello.txt");
		boolean created = file.createNewFile();
		System.out.println("파일 만들기");
		System.out.println(file.getName() + "   " + created);
		System.out.println();
		
		/* 파일 삭제하기 */
		boolean deleted = file.delete();
		System.out.println("파일 삭제하기");
		System.out.println(file.getName() + "    " + deleted);
		System.out.println();
		
		/* 디렉토리 만들기 */
		File dir = new File("/Users/gimsang-eun/공부/자바/재봉/File/subDir1");
		created = dir.mkdir();
		System.out.println("디렉토리 만들기");
		System.out.println(dir.getName() + "    " + created);
		System.out.println();
		
		/* 디렉토리 삭제하기 */
		deleted = dir.delete();
		System.out.println("디렉토리 삭제하기");
		System.out.println(dir.getName() + "    " + deleted);
		System.out.println();
		
		/* 디텍토리 만들기 2 */
		File dir2 = new File("/Users/gimsang-eun/공부/자바/재봉/File/child/images");
		created = dir.mkdirs();
		System.out.println("디렉토리 만들기 2");
		System.out.println(dir.getName() + "    " + created);
		System.out.println();
		
		/* 파일과 디렉토리 구분하기 */
		File some1 = new File("/Users/gimsang-eun/공부/자바/재봉/File/sample.txt");
		File some2 = new File("/Users/gimsang-eun/공부/자바/재봉/File/child");
		File some3 = new File("/Users/gimsang-eun/공부/자바/재봉/File/void");
		
		System.out.println("파일과 디렉토리 구분하기");
		System.out.println(some1.getName() +"      "+ some1.isFile() + "     " + some1.isDirectory());
		System.out.println(some2.getName() +"      "+ some2.isFile() + "     " + some2.isDirectory());
		System.out.println(some3.getName() +"      "+ some3.isFile() + "     " + some3.isDirectory());
		
		/* 파일의 이름 바꾸기 */
		File sample = new File("/Users/gimsang-eun/공부/자바/재봉/File/sample.txt");
		File newName = new File("/Users/gimsang-eun/공부/자바/재봉/File/child/서시.txt"); // 파일 이동도 가능하다.
		sample.renameTo(newName);
		
	}
	
	public void studyList() {
		File dir = new File("/Users/gimsang-eun/");
		
		String[] children = dir.list();
		
		for(String name : children) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------");
		
		File[] childrenFiles = dir.listFiles();
		
		for (File file : childrenFiles) {
			System.out.println(file.getAbsolutePath());
		}
		
	}
	
	public Date convertToDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public String showFileData() {
		
		// Todo
		
		return "";
	}
	
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		fileStudy.studyManage();
//		fileStudy.studyList();
		
//		File file = new File("/Users/gimsang-eun/공부/자바/재봉/File");
//		fileStudy.showFileData();
	
	}
	
}
