# HW1
##### from Junyi Lin
1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
   - please Check README.md in this directory
2. practice git using the platform. list the git commands you learned
```
git init
git add
git commit -m 
git reset --hard commit_id
git log
git checkout -- file
git push origin master
git clone
git switch -c <name>
git merge <name>
git branch -d <name>
git stash
```
3. How to clone a repo from Github ?

- go to the target project directory
- type: `git init`
- type `git add <file>` to add files
- type `git commit -m <message>` to commit

4. How to clone a repo from Github ?
`git clone <URL>`
5. How to create a new branch and checkout to that branch ?
`git switch -c <branch_name>`
6. How to merge the branch_test to master branch in command ? show me the commands
`git switch master`, `git merge branch_test`
7. How to stash your new code before leaving **branch branch_learn_stash** and pop your stash when you checkout back to **branch_learn_stash** ? try commands way and intellij way.
- Commands method: `git stash`, when checkout back, `git stash pop`
- intellij method: Shelve Changes and Unshelve Changes
8. How do you understand PR is based on Branch?
- A pull request signals that you want some changes in your branch merged to a target branch, so a branch is the basic target to do PR.
9. What is maven role ? what it be used to do ?
-  Maven is an automation and project management tool. Maven aims to gather current principles for best practices development and make it easy to guide a project in that direction.
10. What is the lifecycle of maven? could you tell me the details ?
    - Maven Lifecycle: Below is a representation of the default Maven lifecycle and its 8 steps: Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.
        - Validate: This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
        - Compile: It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
        - Test: It runs unit tests for the project.
        - Package: This step packages the compiled code in distributable format like JAR or WAR.
        - Integration test: It runs the integration tests for the project.
        - Verify: This step runs checks to verify that the project is valid and meets the quality standards.
        - Install: This step installs the packaged code to the local Maven repository.
        - Deploy: It copies the packaged code to the remote repository for sharing it with other developers.

11. what is the difference between package and install in maven lifecycle ?
- package - take the compiled code and package it in its distributable format, such as a JAR. verify - run any checks on results of integration tests to ensure quality criteria are met. 
- install - install the package into the local repository, for use as a dependency in other projects locally.
12. What is plugins in maven, list some plugins.
- Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. Such as: `clean` `compiler` `deploy` `failsafe` `install`
13. In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
- groupID: com.chuwa.learn
- artifactID: java-core
        - please check in the directory 
14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.