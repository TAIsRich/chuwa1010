#HW1

######1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
1. https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formattin
g-on-github/basic-writing-and-formatting-syntax
######2. practice git using the platform. list the git commands you learned
1. https://learngitbranching.js.org/
git merge git chechout bugFix

######3. What is the basic steps to init a git repo in you local ?

Create a directory to contain the project
Go into the new directory
Type: git init
Write some code
Type: git add to add the files
Type: git commit

######4. How to clone a repo from Github ?

on GitHub.com, navigate to the main page of the repository
above the list of files click code
copy the url for the repository
open git bash
change the current working directory to the location where you wnat the cloned directory
type "git clone" and then paste the URL you copied earlier
press Enter to create your local clone

######5. How to create a new branch and checkout to that branch ?
$git branch <new-branch>
$git checkout <branch-name>
  
######6. How to merge the branch_test to master branch in command ? show me the commands
  
$git checkout <base brach>
$git merge <merged brach>
  
######7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you
checkout back to **branch_learn_stash ? try commands way and intellij way.

$git stash
$git stach pop
  
######8. How do you understand PR is based on Branch?

PR is pull request
  
######9. What is maven role ? what it be used to do ?

  Manage Dependencies
  Build Project
  Documentation
  Reporting
  
######10. What is the lifecycle of maven? could you tell me the details ?
  clean, prepare resources, validate, package, install
######11. what is the difference between package and install in maven lifecycle ?
  package creates the JAR/WAR package as mentioned in the packaging in POM.xml
  install installs the package in local/remote maven repository
######12. What is plugins in maven, list some plugins.
  plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects.
######13. In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
1. groupID: com.chuwa.learn
2. artifactID: java-core
######14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other
students' PR, please don't merge it
