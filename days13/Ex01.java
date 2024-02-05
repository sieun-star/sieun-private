package days13;

import days14.Time;
import days14.Tv;

/**
 * @author SIEUN
 *@date2024. 1. 17. - 오전 8:59:55
 *@subject
 *@content
 */
public class Ex01 {

	public static void main(String[] args)  {
		
		Time t = new Time();
		t.hour = 1;
		
		Tv tv1 = new Tv(); 
		// Student s1 = new Student();  X
		
		// 1. Git 개요
          // 2. GitHub 계정 생성
		  // 3. Git 설치 https://git-scm.com/
		  // 4. New Repository - javaPro
		  // 5. Token : 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 
		  // 6. E:\Class\Workspace\JavaClass-Home (집)
		  // 6. E:\Class\Workspace\JavaClass-Sist (교육원)
		  // 7. Git 사용자 등록
		  //     $ git config --global user.name "사용자이름"
		  //     $ git config --global user.email "사용자이메일"
		  // 7-2 . $ git config user.name
		  // 7-2 . $ git config user.email
		  // 7-2 . $ git config-l
		  // 8. 원격저장소 등록 확인
		  // $ git remove -v
		  // $ git remote -v
		  // fatal: not a git repository (or any of the parent directories): .git
		  // 9. 로컬저장소생성
		  // $ git init
		  // Initialized empty Git repository in E:/Class/Workspace/JavaClass-Sist/.git/
		
		// 10.ls  -> 목록보기
		// $ ls
		// Hello.java  Hello.class
		
		// 11. java project : gitPro
		// 11-2.     .gitignore 파일확인   -> /.metadata/
		
		// 12. $ git status
//		$ git status
//		On branch master

//		No commits yet

//		Untracked files:
//		  (use "git add <file>..." to include in what will be committed)
//		        .gitignore
//		        Hello.java
//		        gitPro/

//		nothing added to commit but untracked files present (use "git add" to track)
          
		//13. 다시 원격저장소 확인 -> 원격저장소 등록
		// https://github.com/sieun-star/javaPro.git
		// git remote add origin https://github.com/sieun-star/javaPro.git
        //13-2.
		// $ git remote -v
		// origin  https://github.com/sieun-star/javaPro.git (fetch)
		// origin  https://github.com/sieun-star/javaPro.git (push)
		
		/*
		$ git add -h
		usage: git add [<options>] [--] <pathspec>...

		    -n, --[no-]dry-run    dry run
		    -v, --[no-]verbose    be verbose

		    -i, --[no-]interactive
		                          interactive picking
		    -p, --[no-]patch      select hunks interactively
		    -e, --[no-]edit       edit current diff and apply
		    -f, --[no-]force      allow adding otherwise ignored files
		    -u, --[no-]update     update tracked files
		    --[no-]renormalize    renormalize EOL of tracked files (implies -u)
		    -N, --[no-]intent-to-add
		                          record only the fact that the path will be added later
		    -A, --[no-]all        add changes from all tracked and untracked files
		    --[no-]ignore-removal ignore paths removed in the working tree (same as --no-all)
		    --[no-]refresh        don't add, only refresh the index
		    --[no-]ignore-errors  just skip files which cannot be added because of errors
		    --[no-]ignore-missing check if - even missing - files are ignored in dry run
		    --[no-]sparse         allow updating entries outside of the sparse-checkout cone
		    --[no-]chmod (+|-)x   override the executable bit of the listed files
		    --[no-]pathspec-from-file <file>
		                          read pathspec from file
		    --[no-]pathspec-file-nul
		                          with --pathspec-from-file, pathspec elements are separated with NUL character

         */
		
		// 14.스테이징 영역 추가
        // $ git add .
		/*
		$ git status
		On branch master

		No commits yet

		Changes to be committed:
		  (use "git rm --cached <file>..." to unstage)
		        new file:   .gitignore
		        new file:   Hello.java
		        new file:   gitPro/.classpath
		        new file:   gitPro/.gitignore
		        new file:   gitPro/.project
		        new file:   gitPro/.settings/org.eclipse.jdt.core.prefs
		        new file:   gitPro/src/gitPro/Sample.java
		        new file:   gitPro/src/module-info.java
           */
		  // 15. 로컬 저장소( git directiory ) 추가
//		$ git commit -m "first javaPro commit"
//		[master (root-commit) 31705a0] first javaPro commit
//		 8 files changed, 61 insertions(+)
//		 create mode 100644 .gitignore
//		 create mode 100644 Hello.java
//		 create mode 100644 gitPro/.classpath
//		 create mode 100644 gitPro/.gitignore
//		 create mode 100644 gitPro/.project
//		 create mode 100644 gitPro/.settings/org.eclipse.jdt.core.prefs
//		 create mode 100644 gitPro/src/gitPro/Sample.java
//		 create mode 100644 gitPro/src/module-info.java
          
		// 16. 원격 저장소 추가.
		// $ git push --set-upstream origin master
		/*
		Enumerating objects: 14, done.
		Counting objects: 100% (14/14), done.
		Delta compression using up to 8 threads
		Compressing objects: 100% (10/10), done.
		Writing objects: 100% (14/14), 1.58 KiB | 809.00 KiB/s, done.
		Total 14 (delta 0), reused 0 (delta 0), pack-reused 0
		To https://github.com/sieun-star/javaPro.git
		 * [new branch]      master -> master
		branch 'master' set up to track 'origin/master'.
        */
		
		// 17. JavaClass-Sist(교육원) -> 원격저장소
		
		// -- [집] -- JavaClass-Home 폴더(집)
		// 1) E:\Class\Workspace\JavaClass-Home 폴더 이동
		// 2) Git Repository(깃 로컬 저장소 ) 생성
        //     git init X
		//     git clone
		//
		/* 
		$ git clone https://github.com/sieun-star/javaPro.git JavaClass
		Cloning into 'JavaClass'...
		remote: Enumerating objects: 20, done.
		remote: Counting objects: 100% (20/20), done.
		remote: Compressing objects: 100% (14/14), done.
		remote: Total 20 (delta 3), reused 19 (delta 2), pack-reused 0
		Receiving objects: 100% (20/20), done.
		Resolving deltas: 100% (3/3), done.
        */

        // git config user.name , user.email 등록
		// git remote - origin ~~ 원격저장소도 origin 별칭으로 등록
		// 
		
		
		
		
		// ***[이클립스 + git명령어 ]***
		// 1. JavaClass-Sist 폴더(교육원)
		//      ㄴ 바로 이클립스 실행....
		//         gitPro 자바프로젝트 생성
		// 2. GitHub
		//         javaPro 원격저장소 생성
		// 3. javaPro 원격저장소를 복제(clone)
		//  https://github.com/sieun-star/javaPro.git 반드시 먼저 복사.
		// 3-2. C:\Users/user\git\javaPro 로컬 저장소 설정
		//             ㄴ .git폴더
		//             ㄴ 원격 저장소로부터 복제한 폴더, 파일
		// 4. 충돌 처리 + merge
		// 
		
		
		///////////////////// 집 /////////////////////////
		
		
		
		
	} // main
	
} // class
	