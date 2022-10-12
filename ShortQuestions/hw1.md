**Write your hw1 in hw1.md**
1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
	1. https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
2. practice git using the platform.list the git commands you learned
	1. https://learngitbranching.js.org/
	>commit; branch; merge; rebase; HEAD; ^; ~(*); cherry-pick; tag; describe; 
3. What is the basic steps to init a git repo in you local?
	>Go into the directory containing the project.
	>Type git init.
	>Type git add to add all of the relevant files.
	>You’ll probably want to create a .gitignore file right away, to indicate all of the files you don’t want to track. Use git add .gitignore, too.
	>Type git commit.

4. How to clone a repo from Github?
	>git clone url
5. How to create a new branch and checkout to that branch?
	>git checkout -b newBranch
	>or
	>git branch newBranch
	>git checkout branch
6. How to merge the branch_test to master branch in command?show me the commands
	>git checkout master
	>git merge branch_test
7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
  >git stash push
8. How do you understand PR is based on Branch?
  >When you made changes to the branch, you need push. PR shows the difference between the original one and the one you made changes.
9. What is maven role? what it be used to do?
  >Maven is a open-source build tool to build, publish, and deploy several projects at once for better project management. The tool provides allows developers to build and document the lifecycle framework. 
10. What is the lifecycle of maven? could you tell me the details ?

  >*Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.*
  
  >Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
  >Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
  >Test: It runs unit tests for the project.
  >Package: This step packages the compiled code in distributable format like JAR or WAR.
  >Integration test: It runs the integration tests for the project.
  >Verify: This step runs checks to verify that the project is valid and meets the quality standards.
  >Install: This step installs the packaged code to the local Maven repository.
  >Deploy: It copies the packaged code to the remote repository for sharing it with other developers.
11. what is the difference between package and install in maven lifecycle ?
  >*package will compile your code and also package it. For example, if your pom says the project is a jar, it will create a jar for you when you package it and put it somewhere in the target directory (by default).

  >*install will compile and package, but it will also put the package in your local repository. This will make it so other projects can refer to it and grab it from your local repository.

12. What is plugins in maven, list some plugins.

  >Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. 
  >[Maven Plugins](https://maven.apache.org/plugins/)
13. In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
	1. groupID:com.chuwa.learn
	2. artifactID:java-core
  ![Image](https://user-images.githubusercontent.com/78085774/195385247-886c65f2-5a02-4c1c-b682-c113e12ee437.jpg)



14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other
students' PR, please don't merge it.
