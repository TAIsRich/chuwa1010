# hw1.md


### 1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
	[Basic Writing and Formatting Syntax](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax/)


### 2. Practice git using the [platform](https://learngitbranching.js.org/). List the git commands you learned.

- git branch
- git checkout
- git commit
- git merge
- git rebase
- git pull
- git push
- git clone


### 3. What is the basic steps to init a git repo in you local?

1. go to the project folder using: cd /directory_to_project
2. execute command: git init


### 4. How to clone a repo from Github?

execute command: git clone repo_url


### 5. How to create a new branch and checkout to that branch?

1. execute command: git branch branch_name
2. execute command: git checkout branch_name


### 6. How to merge the branch_test to master branch in command? Show me the commands.

1. go to the master branch using: git checkout master_branch
2. merge the branch_test into the master branch using: git merge branch_test


### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? Try commands way and IntelliJ way.

1. commands way
	- execute command: git stash
	- go to branch_learn_stash using: git checkout branch_learn_stash; then execute command: git stash pop 
2. IntelliJ way
	- go to git -> stash changes
	- go to git -> checkout branch_learn_stash -> pop stash


### 8. How do you understand PR is based on Branch?

- Doing pull request to an user's branch is making some changes to the branch which this user created from the master branch.
- This allows many users to create various versions of the master branch, without affecting the master branch if any errors occur when editting. 


### 9. What is maven role? What it be used to do?

- Maven is a management tool for Java-based projects.
- It's used for project building, dependencies downloading, and documenting.


### 10. What is the lifecycle of maven? Could you tell me the details?

- The lifecycle of maven has 8 steps.
- validate: validates if the project structure is correct
- compile: compiles the source code, converts the .java files to .class and store the classes in target/classes folder
- test: runs unit tests for the project
- package: packages the compiled code in distributable format like JAR or WAR
- integration test: runs the integration tests for the project
- verify: runs checks to verify that the project is valid and meets the quality standards
- install: installs the packaged code to the local maven repository
- deploy: copies the packaged code to the remote repository for sharing it with other developers


### 11. What is the difference between package and install in maven lifecycle?

- Package: creates JAR/WAR package
- Install: installs the package to local maven repository


### 12. What is plugins in maven. List some plugins.

- Plugin is one of the vital features of Maven. It's used to reuse the common build logic across different projects.
- Examples: clean, compiler, deploy, failsafe, install, resources, site, surefire, verifier, etc.


### 13. In chuwa1010, MavenProject directory, create a maven Module using IntelliJ, named it as belows:
	1. groupID:com.chuwa.learn
	2. artifactID:java-core


### 14. Do Code Review: go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.


