### 1.  Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
[Learn MarkDown](https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formattng-on-github/basic-writing-and-formatting-syntax)

### 2.  practice git using the platform. list the git commands you learned
[Learn git](https://learngitbranching.js.org/)

### 3.  What is the basic steps to init a git repo in you local ?
> cd to_folder
> git init



### 4.  How to clone a repo from Github ?
Find the repository, under the button "code", copy the link and run git clone + <the link> on the terminal.

### 5.  How to create a new branch and checkout to that branch ?
> git branch firstName_lastName/notes
> git checkout firstName_lastName/notes

### 6.  How to merge the branch_test to master branch in command ? show me the commands
> git checkout master
> git merge branch_test

### 7.  How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
Before leaving the branch:
> git stash


### 8.  How do you understand PR is based on Branch?
PR is to submit work, so other people can review it before merging to base branch.

### 9.  What is maven role ? what it be used to do ?
- Manage Dependencies(Package)
- Build Project (Cycle)
- Documentation
- Reporting

Maven is a open-source build tool to build, publish, and deploy several projects at once for better project management. The tool provides allows developers to build and document the lifecycle framework.


### 10.  What is the lifecycle of maven? could you tell me the details ?
> mvnClean -> prepare-resources -> validate -> package -> install

| Phase  | Handles | Description |
| ----------- | ----------- | ----- |
| prepare resources | resource copying | Resource copying can be customized in this phase.
| validate | Validating the information | Validates if the project is correct and if all necessary information is available. |
| compile | compilation | Source code compilation is done in this phase. |
| Test |  Testing | Tests the compiled source code suitable for testing framework.|
| package | packaging | This phase creates the JAR/WAR package as mentioned in the packaging in POM.xml.|
| install | installation | This phase installs the package in local/remote maven repository.|
| Deploy | Deploying  | Copies the final package to the remote repository.

### 11.  what is the difference between package and install in maven lifecycle ?
Package is compiling the code into a JAR or WAR file. And install step  is to put the file into a remote or local folder for use as dependency for other project.

### 12.  What is plugins in maven, list some plugins.
In maven plugin are used to accomplish tasks, it's used to build, deploy, clean, install etc. The lists of plugins can be found in this link. [list some plugins](https://maven.apache.org/plugins/)


### 13.  In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
        1.  groupID: com.chuwa.learn
        2.  artifactID: java-core


### 14.  Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other students' PR, please don't merge it.


