# hw1

##3. What is the basic steps to init a git repo in your local?

We need to change directory to your prefered directory then use "git clone repo_url" to clone the repo to your local directory.

##4. How to clone a repo from Github?

Use "git clone" command to clone the repo to the local directory.

##5. How to create a new branch and checkout to that branch?

Use "git branch branch_name" to create a new branch and "git checkout branch_name" to checkout the branch.
 
##6. How to merge the "branch_test" to master branch in command?

"git checkout master" //Change to the master branch
"git merge branch_test" //Merge the current branch with "branch_test"
"git branch -d branch_test" //Delete the "branch_test"

##7. How to stash your your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash? Try comands way and intellij way.

"git add ." to add files to the stageing area
"git commit -m "message"" to create a snapshot of changes and save it to the git directory

##8. How do you understand PR is based on Branch?

PR is a feature that allows you to inform others of the changes you have made to the repository through your branch.

##9. What is maven's role? what it be used to do?

Maven's role is to build documentaion and dependency process of projects with any level of comlexity written in java or c that uses Project Object Model and that follows the convention of source code, compilling code, and so on.

##10. What is the lifecycle of maven? could you tell me the detail?

Maven is based around the cnetral concept of a build lifecycle. It means that the process for building and distributing a particular artifact is clearly defined. 
For the person building a project, this means that it is only necessary to learn a small set of commands to build any Maven project, and POM will ensurethey get the results they desired.

##11. What is the difference between package and install in maven lifecycle? 

Each of these build lifecycles is defiend by a different list of build phases, wherein a build phase represents a stage in the lifecycle.
"Package" - take the compiled code and package it in its distributable format, such as a JAR.
"Install" - install the package into the local repository, for use as a dependency in other projects locally

##12. What is plugins in maven, list some plugins.

Maven is a plugin framework; all work is done by plugins.

"clean" - clean up after build
"compiler" - compiles Java sources
"deploy" - deploy the built artifact to the remote repository
