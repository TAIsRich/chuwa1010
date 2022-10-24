###### 2. practice git using the platform. list the git commands you learned 
Learned the following commands - 
```
git commit
git checkout
git checkout -b
git merge
git clone
```

###### 3. What is the basic steps to init a git repo in you local ?
Go to the root of the project and type git init

###### 4. How to clone a repo from Github ?
git clone the URL of the repository

###### 5. How to create a new branch and checkout to that branch ?
git checkout -b branch name

###### 6. How to merge the branch_test to master branch in command ? show me the commands
```
git checkout branch_test
git pull origin master
git checkout master
git merge branch_test
```
   
###### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
```
git stash save "changes on branch_learn_stash"
git checkout "another branch"
git checkout branch_learn_stash
git stash pop
```

IntelliJ way - git -> stash -> create stash -> checkout another branch -> checkout branch_learn_stash -> git -> unstash changes

###### 8. How do you understand PR is based on Branch?
Per GitHub Docs, creating a PR is to propose and collaborate on changes to a repository. 
These changes are proposed in a branch, which ensures that the default branch only contains finished and approved work.

###### 9. What is maven role ? what it be used to do ?
Maven is for managing dependencies, building project, documentation, reporting ans has some other functionalities. 
Maven makes it easier to download, add, and delete dependencies/libraries. 

###### 10. What is the lifecycle of maven? could you tell me the details ?
clean -> prepare resources -> validate -> package -> install
```
validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework
package - take the compiled code and package it in its distributable format, such as a JAR
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects
clean - clean up after the build
```

###### 11. what is the difference between package and install in maven lifecycle ?
package - take the compiled code and package it in its distributable format, such as a JAR
install - install the package into the local repository, for use as a dependency in other projects locally

###### 12. What is plugins in maven, list some plugins
Per Apache Maven website, "Maven" is really just a core framework for a collection of Maven Plugins. 
In other words, plugins are where much of the real action is performed, plugins are used to: create jar files, 
create war files, compile code, unit test code, create project documentation, and on and on. 
some plugins in Maven - compiler - compiles Java sources, deploy - deploy the built artifact to the remote repository, etc..
