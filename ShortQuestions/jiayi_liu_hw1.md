***Submission for hw1


3.  What is the basic steps to init a git repo in you local ?

Type "git init" 

4.  How to clone a repo from Github ?

find the clone path in Github, copy it, and then use syntax "git clone ***"

5.  How to create a new branch and checkout to that branch ?

git checkout -b branch_name

6.  How to merge the branch_test to master branch in command ? show me the commands

git merge new-branch

7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
checkout back to **branch_learn_stash ? try commands way and intellij way.



8.  How do you understand PR is based on Branch?

it means, people want to merge the changes into main branch

9.  What is maven role ? what it be used to do ?

package management tool for java development project

10.  What is the lifecycle of maven? could you tell me the details ?

mvnClean -> prepare-resources -> validate -> package -> install

11.  what is the difference between package and install in maven lifecycle ?

package -> This phase creates the JAR/WAR package as mentioned in the packaging in POM.xml.
install -> This phase installs the package in local/remote maven repository.

12.  What is plugins in maven, list some plugins.

Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. 

13.  In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
  1)  groupID: com.chuwa.learn
  2)  artifactID: java-core


14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other 
students' PR, please don't merge it.
