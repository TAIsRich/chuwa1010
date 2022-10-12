# Chuwa 1010 HW 1

### 1. Learn MarkDown. Show all of basic usage in the ShortQuestions/README.md.


### 2. List the git commands you learned.
```
git clone link
git status
git add .
git commit -m “update message”
git push
```


### 3. What is the basic steps to init a git repo in you local?
```git init```


### 4. How to clone a repo from Github?
```git clone url```


### 5. How to create a new branch and checkout to that branch?
- Method 1:  
```git branch branch_name```  
```git checkout branch_name```  
- Method 2:  
```git checkout -b branch_name```


### 6. How to merge the branch_test to master branch in command? Show me the commands.
1) return to master branch  
```git checkout master```  
2) merge branch_test to master branch  
```git merge branch_test```  
3) delete the branch_test branch  
```git branch -d branch_test```  

### 7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? Try commands way and IntelliJ way.
- 1) Commands way:
First, stash new code before leaving the branch_learn_stash branch:
```git stash```
Second, go to the master branch:
```git checkout master```
Third, checkout back to the branch_learn_stash branch:
```git stash pop```

- 2) IntelliJ way:
In the IntelliJ, we need to do the following.  
First, stash new code before leaving the branch_learn_stash branch:  
Git ==> Stash Changes ==> create stash
Second, go to the master branch:  
Git ==> Branches ==> master  
Third, checkout back to the branch_learn_stash branch:  
Git ==> Unstash changes ==> select the stash@{0} ==> apply stash


### 8. How do you understand PR is based on Branch?
Since pull request(PR) is that we pull the depository, make ourself directory(branch), change some code/content in the branch, and merge the branch. Creating a new branch can help us to do work isolatedly and safely. 


### 9. What is maven role? what it be used to do?
Maven can manage dependencies(package), build project(cycle), such as specification, execution, and reporting of unit tests. And Maven is also a documentation tool.


### 10. What is the lifecycle of maven? could you tell me the details ?
There are three built-in build lifecycles: default, clean and site. 
The default lifecycle handles the project deployment.
The clean lifecycle handles project cleaning.
The site lifecycle handles the creation of the project's web site.

For the default lifecycle, Maven will first validate the project, then will try to compile the sources, run those against the tests, package the binaries (e.g. jar), run integration tests against that package, verify the integration tests, install the verified package to the local repository, then deploy the installed package to a remote repository.

For the clean lifecycle, it includes three phases, pre-clean, clean, and post-clean.

For the site lifecycle, if includes four phases, pre-site, site, post-site, and site-deploy. The purpose of the site lifecycle is to build and publish a project site. Maven can automatically generate a project site based on the information described by the pom, and can also generate relevant reports and documents as needed to be integrated in the site, which is convenient for teams to communicate and publish project information.

### 11. What is the difference between package and install in maven lifecycle?
package: This phase creates the JAR/WAR package as mentioned in the packaging in POM.xml.  
install: This phase installs the package in local/remote maven repository.


### 12. What is plugins in maven, list some plugins.
Plugins are the central feature of Maven that allow for the reuse of common build logic across multiple projects. They do this by executing an "action" (i.e. creating a WAR file or compiling unit tests) in the context of a project's description - the Project Object Model (POM).

maven-antrun-plugin
maven-archetype-plugin
maven-assembly-plugin
maven-dependency-plugin
maven-enforcer-plugin
maven-help-plugin
maven-release-plugin
maven-resources-plugin
maven-surefire-plugin


### 13. In chuwa1010, MavenProject directory, create a maven Module using IntelliJ, named it as below:
1) groupID: com.chuwa.learn
2) artifactID: java-core

### 14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.