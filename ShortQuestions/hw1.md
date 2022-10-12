# Homework1
### 1.Learn MarkDown and show all of basic usage in the ShortQuestions/ README.md

Heading, Styling text, Quoting code

### 2.practice git using the platform. list the git commands you learned

git commit, git checkout(switch), git merge, git rebase
  
### 3.What is the basic steps to init a git repo in you local ?

Create a directory to contain the project.
 git init.
 git add 
 git commit.
 
### 4.How to clone a repo from Github ?
	
  git clone
  
### 5.How to create a new branch and checkout to that branch ?
	
  git checkout –b
  
### 6.How to merge the branch_test to master branch in command ? show me the commands
	
  git checkout branch_test
	(git commit)
	git checkout master
	(git pull)
	(git commit)
	git merge branch_test
  
### 7.How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash ? try commands way and intellij way.
	
  git stash save “changes”
	git checkout xx
	git checkout branch_learn_stash
	git stach pop
  
  git -> uncommitted changes> stash changes -> checkout another branch -> checkout 
  
### 8.How do you understand PR is based on Branch?

Pull request compare changes in two branches

### 9.What is maven role ? what it be used to do ?

download add and remove the dependencies/libraries
Manage Dependencies(Package). 
Build Project (Cycle) 
Documentation
Reporting

### 10.What is the lifecycle of maven? could you tell me the details ?
	
  clean -> prepare resources -> validate -> package -> install
Prepare-resources: Resource copying can be customized in this phase. 
Validate: Validates if the project is correct and if all necessary information is available. 
Compile: Source code compilation is done in this phase. 
Test: Tests the compiled source code suitable for testing framework. 
Package: This phase creates the JAR/WAR package 
Install: This phase installs the package in local/remote maven repository. 
Deploy: Copies the final package to the remote repository

### 11.what is the difference between package and install in maven lifecycle?
	
  package - take the compiled code and package it in its distributable format, such as a JAR
install - install the package into the local repository, for use as a dependency in other projects locally

### 12.What is plugins in maven, list some plugins.

Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. They do this by executing an "action" (i.e. creating a WAR file or compiling unit tests) in the context of a project's description - the Project Object Model (POM). 
For my understanding, plugins are extension to Maven, letting Maven have more functions.
Clean, compiler, deploy, site, verifier… are some Maven plugins.

13.
	
