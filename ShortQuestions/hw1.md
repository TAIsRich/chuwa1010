#Homework 1

###1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
*Please see README.md*

###2. practice git using the platform. list the git commands you learned
```bash
git clone "repo url"
git branch
git branch -f 
git checkout
git checkout -b
git add .
git commit
git commit -m "comment"
git reset
git revert
git rebase
git rebase -i
```
###3. What is the basic steps to init a git repo in you local?
1. cd to the directory
2. git init
3. make changes
4. git add .
5. git commit

###4. How to clone a repo from Github?
1. cd the local directory
2. git clone "url"

###5. How to create a new branch and checkout to that branch ?
1. ```bash
   git branch "new branch'"
   git checkout "new branch"
   ```
   *or*
2. ```bash
   git checkout -b "new branch"
   ```

###6. How to merge the branch_test to master branch in command ? show me the commands
```bash
git checkout main
git merge branch_test
```

###7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
Command:
```bash
git stash #temporarily switch away from the current changes while saving the changes
git stash pop #retrieve the saved changes
```
Intellij:
It has a more powerful feature shelve, which is more flexible in selecting which changes to be saved.

###8. How do you understand PR is based on Branch?
A PR is a request initiated by a branch (Let's call it branch A) to another branch B (could be main as well) to ask branch B to apply the changes to itself from the version provided by branch A.

###9. What is maven role ? what it be used to do?
Maven can be seen as a build factory used to primarily build Java softwares, which specifies dependencies, modules, properties, plug-ins, and a lot of other enviromental setups required to make the software run from the source code. It functions not only like a module/library managers but also like an building insturction attched to the software.

###10. What is the lifecycle of maven? could you tell me the details ?
1. prepare-resources: copy all the needed files for building the software, which might include source codes, external modules, etc.
2. validate: validate if we have all the required resources
3. complie: complie source java code into low level code
4. test: test the complied code according to specfied framework
5. package: creates JAR/WAR package to be installed
6. install: intall the package in a local repository
7. deploy: copy the package to a remote repository

###11. what is the difference between package and install in maven lifecycle ?
Package is to zip all the required resources into a JAR/WAR file that can be easily moved around, while install is to unzip the resources from JAR/WAR file to make it runable

###12. What is plugins in maven, list some plugins
Plugins can be seen as different features of maven to acheive different goals.
For example:
1. compiler is used to compile Java source code
2. install is used to install the software to a local repository
3. jar is used to build package a JAR file from current project

