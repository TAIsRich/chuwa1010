## HW1 - Git, PR, Maven

1. **Learn MarkDown and show all of basic usage in the ShortQuestions/README.md**
   https://docs.github.com/en/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax
2. **Practice git using the platform. list the git commands you learned** https://learngitbranching.js.org/
    - ```git commit```
    - ```git checkout```
    - ```git checkout -b <branch_name>``` 
    - ```git switch```
    - ```git merge```
    - ```git rebase``` 

3. **What is the basic steps to init a git repo in you local?**
    - First, create a directory to contain the project and go into it.
    - Second, type ```git init```.
    - Third, write your code.
    - Fourth, type ```git add .``` to add the files.
    - Lastly, type ```git commit```.


4. **How to clone a repo from GitHub?**
    - ```git clone <url>```

5. **How to create a new branch and checkout to that branch?**
   - ```git checkout -b <branch_name>```

6. **How to merge the branch_test to master branch in command?**

   ```
    git checkout -b branch_test
    git merge branch_test
   ```

7. **How to stash your new code before leaving branch branch_learn_stash and pop your stash when you checkout back to branch_learn_stash?**
   ```
   git stash
   git stash pop
   ```

8. **How do you understand PR is based on Branch?**

    The new changes in the head branch should be integrated into the base branch, so the PR could show the changes between base branch and head branch;

9. **What is maven role ? what it be used to do?**

    Maven is a popular open-source build tool to build, publish, and deploy several projects at once for better project management.
    In the project we use Maven to manage build configurations and dependencies.

10. **What is the lifecycle of maven? could you tell me the details?**

    >Maven Lifecycle has 8 steps: Validate, Compile, Test, Package, Integration test, Verify, Install and Deploy.

    - ```validate``` - This step validates if the project structure is correct. For example – It checks if all the dependencies have been downloaded and are available in the local repository.
    - ```compile``` - It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
    - ```test``` - It compiles the source code, converts the .java files to .class and stores the classes in target/classes folder.
    - ```package``` - This step packages the compiled code in distributable format like JAR or WAR.
    - ```Integration test``` - It runs the integration tests for the project.
    - ```verify``` - This step runs checks to verify that the project is valid and meets the quality standards.
    - ```install``` - This step installs the packaged code to the local Maven repository.
    - ```deploy``` - It copies the packaged code to the remote repository for sharing it with other developers.

11. **What is the difference between package and install in maven lifecycle?**

    ```package``` will compile your code and also package it. For example, if your pom says the project is a jar, it will create a jar for you when you package it and put it somewhere in the target directory (by default).

    ```install``` will compile and package, but it will also put the package in your local repository. This will make it so other projects can refer to it and grab it from your local repository.


12. **What is plugins in maven, list some plugins.**

    The maven plugins are central part of maven framework, it is used to perform specific goal.

    According to Apache Maven, there are 2 types of maven plugins.

    >Build Plugins: These plugins are executed at the time of build. These plugins should be declared inside the <build> element.
    
    >Reporting Plugins: These plugins are executed at the time of site generation. These plugins should be declared inside the <reporting> element.
    
    A list of maven core plugins are given below:
    - ```clean``` - clean up after build.
    - ```compiler``` - compiles java source code.
    - ```deploy``` - deploys the artifact to the remote repository.
    - ```failsafe``` - runs the JUnit integration tests in an isolated classloader.
    - ```install``` - installs the built artifact into the local repository.
    - ```resources``` - copies the resources to the output directory for including in the JAR.
    - ```site``` - generates a site for the current project.
    - ```surefire``` - runs the JUnit unit tests in an isolated classloader.
    - ```verifier``` - verifies the existence of certain conditions. It is useful for integration tests.

13. In chuwa1010, MavenProject directory, create a maven Module using Intellij, named it as belows:
    groupID: com.chuwa.learn
    artifactID: java-core

14. Do Code Review: Go over the PRs in your repo, tried to leave some useful or useful comments in other
    students' PR, please don't merge it.

