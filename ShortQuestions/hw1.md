# HW1 ShortAnswers
1. Learn MarkDown and show all of basic usage in the ShortQuestions/README.md
    * See the README.md
2. practiceg it using the platform.list the git commands you learned
    ```
    git commit
    git branch -b[branch name]
    git checkout  
    git rebase
    
    ```
3. What is the basic steps to init a git repo in you local?
    * find the project in your directory 
    ``` cd /Users/user/my_project ```
    * then type:
    ``` 
    git init 
    git status
    git add .
    git commit -m "some message"
    git push origin master/main 
    
    ```
4. How to clone a repo from Github?
    * using ``` git clone <url> ```
5. How to create a new branch and checkout to that branch?
    * creating a new branch: ``` git branch <branch name>```
    * checkout to taht branch: ``` git checkout <branch name> ```
6. How to merge the branch_test to master branch in command? show me the commands
    * ``` git checkout master ```
    * ``` git merge <branch name> ```
7. How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to **branch_learn_stash ? try commands way and intellij way.
    * ``` git stash ``` or ``` git stash pus ```
    * ``` git stash pop ```
8. How do you understand PR is based on Branch?
    * Pull Requests are a notification mechanism. You modify someone else's code, notify the original author of your modification, and hope that he will merge your modification.
9. What is maven role? what it be used to do?
    * Manage Dependencies(Package)
    * Build Project (Cycle) Documentation
    * Reporting
    * Others
10. What is the lifecycle of maven? could you tell me the details ?
    * The Maven build lifecycle defines the process of building and releasing a project.
    * Maven has the following three standard lifecycles:
        - clean: Processing of project cleanup
        - default (or build): the processing of project deployment
        - site: Processing of project site document creation
    * A typical Maven build life cycle consists of the following sequence of phases:

| Phase | Handles | Description |
| :-----| ----: | :----: |
| prepare- resources | resource copying | Resource copying can be customized in this phase. |
| validate | Validating the information | Validates if the project is correct and if all necessary information is available. |
| compile | compilation | Source code compilation is done in this phase. |
| Test | Testing | Tests the compiled source code suitable for testing framework. |
| package | packaging | This phase creates the JAR/WAR package as mentioned in the packaging in POM.xml. |
| install | installation | This phase installs the package in local/remote maven repository. |
| Deploy | Deploying | Copies the final package to the remote repository. |

11. what is the difference between package and install in maven lifecycle ?
    * package it handles packing it's when we creates the JAR/WAR package as mentioned in the packaging in POM.xml. 
    * install it handles installation it installs the package in local/remote maven repository.
12. What is plugins in maven, list some plugins.
    *  Each life cycle contains a series of phases. These phases are equivalent to the unified interface provided by Maven, and the implementation of these phases is completed by the Maven plugin
    
13. In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
1. groupID:com.chuwa.learn
2. artifactID:java-core
    * See in the directory
