# short questions
1. Basic git commands:
   git clone
   git branch, git checkout branchName, git checkout -b branchName, git add ., git commit -m "comments", 
   git restore ., git pull, git push, git status, git merge, git init, git log
   Change your remote's URL from HTTPS to SSH with the git remote set-url command. $ git remote set-url origin git@github.com:USERNAME/REPOSITORY.git.
2. What is the basic steps to init a git repo in your local?
   step 1: create a project in a directory in local
   step 2：go into the directory and git init
   step 3: git add the code changes in the project
   step 4: git commit
3. How to clone a repo from Github?
   git clone gitURL
4. How to create a new branch and checkout to that branch?
   git checkout -b newBranchName
5. How to merge the branch_test to master branch in command? show me the commands
   step 1: git checkout master
   step 2: git merge branch_test
6. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ?
   (before git add any changes) git stash: to save the changes
   when change back to the branch: git stash pop: to get the saved changes.
   git add, git commit
7. How do you understand PR is based on Branch?
   main branch is like the main stream; the other branches that created from the main branch contain different changes
   which will eventually merge into the main branch.
8. What is maven role? what it is used to do?
   Maven is an automation and management tool and is based on pom. It is used for building and managing any Java-based project.
9. What is the lifecycle of maven? could you tell me the details ?
   The lifecycle of maven is a well-defined sequence of phases. It defines the order in which the goals are to be executed.
   Prepare: resource copying can be customized in this phase;
   validate: validate if the project is correct and if all necessary information is available;
   compile: source code compilation is done is this phase;
   test: tests the compiled code suitable for testing framework;
   package: creates the JAR/WAR package as mentioned in the packaging in POM.xml;
   install: this phase installs the package in local/remote maven repository;
   deploy: copies the final package to the remote repository.

10. what is the difference between package and install in maven lifecycle?
    In package phase, it created packages, take the compiled code and package it in its distributable format, 
    such as a JAR. verify - run any checks on results of integration tests to ensure quality criteria are met., 
    while in install phase, it installs the package.
11. What is plugins in maven, list some plugins.
    Maven plugins provide a set of goals and do every task in maven, such as create files, compile code files, 
    unit testing, create reports, etc.
   Plugins: 
   clean: Cleans up target after the build. Deletes the target directory.
   compiler:Compiles Java source files. 
   surefire: Runs the JUnit unit tests. Creates test reports. 
   jar: Builds a JAR file from the current project. 
   war:Builds a WAR file from the current project.
   javadoc: Generates Javadoc for the project.
   antrun: Runs a set of ant tasks from any phase mentioned of the build.
    